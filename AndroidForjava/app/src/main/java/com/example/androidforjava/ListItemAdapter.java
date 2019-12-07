package com.example.androidforjava;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListItemAdapter extends RecyclerView.Adapter<ListItemAdapter.ViewHolder>{
    private List<HomeListBean> listBeans;
    private Context context;
    public ListItemAdapter(Context context,List<HomeListBean> listBeans){
        this.listBeans=listBeans;
        this.context=context;
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        TextView nameText;
        TextView scoreText;
        TextView monthSellOutText;
        TextView deliveryMoneyText;
        TextView avgConsumptionText;
        TextView arrivedTimeText;

        private ViewHolder(View view){
            super(view);
            this.nameText = view.findViewById(R.id.name);
            this.scoreText = view.findViewById(R.id.score);
            this.monthSellOutText = view.findViewById(R.id.month_sell_out);
            this.deliveryMoneyText = view.findViewById(R.id.deliveryMoney);
            this.avgConsumptionText = view.findViewById(R.id.avg_consumption_money);
            this.arrivedTimeText = view.findViewById(R.id.arrived_time);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        HomeListBean bean = listBeans.get(position);
        holder.nameText.setText(bean.getName());
        holder.scoreText.setText(bean.getScore() + "分");
        holder.monthSellOutText.setText("月售"+ bean.getMonthSellOut());
        holder.deliveryMoneyText.setText("配送￥" + bean.getDeliveryMoney());
        holder.avgConsumptionText.setText("人均￥" + bean.getAvgConsumption());
        holder.arrivedTimeText.setText(bean.getArrivedTime() + "分钟送达");
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"我是第" + position,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return listBeans.size();
    }

    @NonNull
    @Override
    public ListItemAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view= LayoutInflater.from(context)
                .inflate(R.layout.home_list_item,parent,false);
        return new ListItemAdapter.ViewHolder(view);
    }

}
