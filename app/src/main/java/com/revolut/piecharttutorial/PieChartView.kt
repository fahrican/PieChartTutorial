package com.revolut.piecharttutorial

import android.content.Context
import android.graphics.Color
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry

class PieChartView(context: Context) : PieChart(context) {

    var pieData: PieData
    private val colorClassArray: List<Int> = mutableListOf(
        Color.LTGRAY,
        Color.BLUE,
        Color.CYAN,
        Color.DKGRAY,
        Color.MAGENTA,
        Color.GREEN,
        Color.RED
    )


    init {
        val pieDataSet = PieDataSet(dataValues1(), "")
        pieDataSet.colors = colorClassArray
        pieData = PieData(pieDataSet)
    }


    private fun dataValues1(): ArrayList<PieEntry> {
        val dataVals: ArrayList<PieEntry> = ArrayList()

        dataVals.add(PieEntry(15.00F, "Sun"))
        dataVals.add(PieEntry(34.00F, "Mon"))
        dataVals.add(PieEntry(23.00F, "Tue"))
        dataVals.add(PieEntry(86.00F, "Wed"))
        dataVals.add(PieEntry(26.00F, "Thu"))
        dataVals.add(PieEntry(17.00F, "Fri"))
        dataVals.add(PieEntry(63.00F, "Sat"))

        return dataVals
    }
}