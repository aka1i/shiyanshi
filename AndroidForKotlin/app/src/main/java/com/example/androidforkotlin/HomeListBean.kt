package com.example.androidforkotlin

/**
@author yjn
@create 2019/11/7 - 20:28
 */
class HomeListBean {
    var name: String? = null
    var score: Double = 0.toDouble()
    var monthSellOut: Int = 0
    var deliveryMoney: Int = 0
    var avgConsumption: Int = 0
    var arrivedTime: Int = 0

    var dishBeans: List<DishBean>? = null
}
