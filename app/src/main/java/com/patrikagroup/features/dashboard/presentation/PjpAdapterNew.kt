package com.patrikagroup.features.dashboard.presentation

import android.content.Context
import android.graphics.drawable.GradientDrawable
import android.location.Location
import android.os.Handler
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.patrikagroup.R
import com.patrikagroup.app.AppDatabase
import com.patrikagroup.app.Pref
import com.patrikagroup.app.domain.AddShopDBModelEntity
import com.patrikagroup.app.domain.PjpListEntity
import com.patrikagroup.app.utils.AppUtils
import com.patrikagroup.app.utils.FTStorageUtils
import com.patrikagroup.features.location.LocationWizard
import com.patrikagroup.features.nearbyshops.presentation.NearByShopsListClickListener
import kotlinx.android.synthetic.main.inflate_user_pjp_item.view.*
import java.lang.Exception

class PjpAdapterNew(mContext: Context,pjp_list: ArrayList<PjpListEntity>, var listener: PJPClickListner):RecyclerView.Adapter<PjpAdapterNew.MyViewHolderPJP>() {
    private val layoutInflater: LayoutInflater
    private var context: Context
    private var mList: ArrayList<PjpListEntity>? = null

    init {
        layoutInflater = LayoutInflater.from(mContext)
        mList = ArrayList()
        context=mContext
        mList=pjp_list
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolderPJP {
        val v = layoutInflater.inflate(R.layout.inflate_user_pjp_item, parent, false)
        return MyViewHolderPJP(v)
    }

    override fun onBindViewHolder(holder: MyViewHolderPJP, position: Int) {
        holder.bindItems(context, mList!!, listener)
    }

    override fun getItemCount(): Int {
        return mList?.size!!
    }

    inner class MyViewHolderPJP(itemview: View):RecyclerView.ViewHolder(itemview){
        fun bindItems(context: Context, list: List<PjpListEntity>, listener: PJPClickListner){
            itemView.apply {



                    rl_pjp_status.visibility = View.VISIBLE
                    println("pjp_tag_adapterrnew : $adapterPosition")
                    if (!TextUtils.isEmpty(list?.get(adapterPosition)?.customer_name)) {
                        tv_pjp_name.text = list?.get(adapterPosition)?.customer_name

                        var isVisited=false
                        val visitedShop = AppDatabase.getDBInstance()?.shopActivityDao()?.getShopForDay(list?.get(adapterPosition)?.customer_id!!, AppUtils.getCurrentDateForShopActi())
                        if (visitedShop != null){
                            try{
                                if(visitedShop.get(0).isVisited){
                                    isVisited=true
                                }else{
                                    isVisited=false
                                }
                            }catch (e: Exception){
                                isVisited=false
                            }

                        }

                        val shopID = list?.get(adapterPosition)!!.customer_id!!
                        val shopDetails = AppDatabase.getDBInstance()?.addShopEntryDao()?.getShopByIdN(shopID)
                        val shopLocation = Location("")
                        shopLocation.latitude = shopDetails!!.shopLat
                        shopLocation.longitude = shopDetails!!.shopLong
                        val myLoc = Location("")
                        myLoc.latitude = Pref.latitude!!.toDouble()
                        myLoc.longitude = Pref.longitude!!.toDouble()

                        val isShopNearby = FTStorageUtils.checkShopPositionWithinRadious(myLoc, shopLocation, LocationWizard.NEARBY_RADIUS)

                        val bgShape = itemView.view.background as GradientDrawable
                        if (visitedShop == null || visitedShop.isEmpty() || !visitedShop[0].isVisited) {
                            itemView.tv_status.text = "Pending"
                            itemView.iv_task_icon.setImageResource(R.drawable.ic_pending_icon)
                            bgShape.setColor(context.resources.getColor(R.color.yellow))
                            if (isShopNearby && !isVisited) {
                                itemView.tv_status.text = "Revisit"
                                itemView.iv_task_icon.setImageResource(R.drawable.revisit)
                                bgShape.setColor(context.resources.getColor(R.color.yellow))
                            }
                        } else {
                            itemView.tv_status.text = "Visited"
                            itemView.iv_task_icon.setImageResource(R.drawable.ic_visited_icon)
                            bgShape.setColor(context.resources.getColor(R.color.green))
                        }

                        itemView.rl_pjp_status.setOnClickListener(View.OnClickListener {
                            if(itemView.tv_status.text.equals("Revisit")){
                                listener.visitShop(shopDetails)
                            }
                        })


                    }
                    else if (!TextUtils.isEmpty(list?.get(adapterPosition)?.location)) {
                        tv_pjp_name.text = list?.get(adapterPosition)?.location

                        itemView.iv_task_icon.setImageResource(R.drawable.ic_others_icon)
                        itemView.tv_status.text = ""
                        val bgShape = itemView.view.background as GradientDrawable
                        bgShape.setColor(context.resources.getColor(R.color.purple))
                    }
                    else {
                        tv_pjp_name.text = "Other PJP"

                        itemView.iv_task_icon.setImageResource(R.drawable.ic_others_icon)
                        itemView.tv_status.text = ""
                        val bgShape = itemView.view.background as GradientDrawable
                        bgShape.setColor(context.resources.getColor(R.color.purple))
                    }






            }
        }
    }

}