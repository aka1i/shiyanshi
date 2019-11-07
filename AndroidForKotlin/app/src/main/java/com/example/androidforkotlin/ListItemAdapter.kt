package com.example.androidforkotlin

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
@author yjn
@create 2019/11/7 - 20:35
 */
class ListItemAdapter(private val context: Context, private val listBeans: List<HomeListBean>) :
    RecyclerView.Adapter<ListItemAdapter.ViewHolder>() {

    class ViewHolder constructor(view: View) : RecyclerView.ViewHolder(view) {
        var nameText: TextView
        var scoreText: TextView
        var monthSellOutText: TextView
        var deliveryMoneyText: TextView
        var avgConsumptionText: TextView
        var arrivedTimeText: TextView

        init {
            this.nameText = view.findViewById(R.id.name)
            this.scoreText = view.findViewById(R.id.score)
            this.monthSellOutText = view.findViewById(R.id.month_sell_out)
            this.deliveryMoneyText = view.findViewById(R.id.deliveryMoney)
            this.avgConsumptionText = view.findViewById(R.id.avg_consumption_money)
            this.arrivedTimeText = view.findViewById(R.id.arrived_time)

        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val bean = listBeans[position]
        holder.nameText.setText(bean.name)
        holder.scoreText.setText(bean.score.toString() + "分")
        holder.monthSellOutText.text = "月售" + bean.monthSellOut
        holder.deliveryMoneyText.text = "配送￥" + bean.deliveryMoney
        holder.avgConsumptionText.text = "人均￥" + bean.avgConsumption
        holder.arrivedTimeText.setText(bean.arrivedTime.toString() + "分钟送达")
    }

    override fun getItemCount(): Int {
        return listBeans.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): ListItemAdapter.ViewHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.home_list_item, parent, false)
        return ListItemAdapter.ViewHolder(view)
    }


}
