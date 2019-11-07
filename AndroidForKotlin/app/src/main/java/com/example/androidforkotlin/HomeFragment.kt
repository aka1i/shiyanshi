package com.example.androidforkotlin


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_home.*
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 */


class HomeFragment : Fragment() {

    private var mainView: View? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_home, container, false)
        return mainView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        homeRecyclerView.layoutManager = LinearLayoutManager(activity)

        val listBeans = ArrayList<HomeListBean>()
        val bean1 = HomeListBean()
        with(bean1){
            name = "高八斗(福大店)"
            score = 4.8
            monthSellOut = 481
            deliveryMoney = 3
            avgConsumption = 19
            arrivedTime = 30
        }

        val bean2 = HomeListBean()
        with(bean2){
            name = "高八斗(福大店)"
            score = 4.8
            monthSellOut = 481
            deliveryMoney = 3
            avgConsumption = 19
            arrivedTime = 30
        }

        val bean3 = HomeListBean()
        with(bean3){
            name = "高八斗(福大店)"
            score = 4.8
            monthSellOut = 481
            deliveryMoney = 3
            avgConsumption = 19
            arrivedTime = 30
        }

        with(listBeans){
            add(bean1)
            add(bean2)
            add(bean2)
        }
        val adapter = ListItemAdapter(activity as Context, listBeans)
        homeRecyclerView.setAdapter(adapter)

    }

}// Required empty public constructor

