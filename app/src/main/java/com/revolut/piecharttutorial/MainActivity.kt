package com.revolut.piecharttutorial

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.PieData
import com.github.mikephil.charting.data.PieDataSet
import com.github.mikephil.charting.data.PieEntry
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var pieChart: PieChart
    val colorClassArray: List<Int> = mutableListOf(
        Color.LTGRAY,
        Color.BLUE,
        Color.CYAN,
        Color.DKGRAY,
        Color.MAGENTA,
        Color.GREEN,
        Color.RED
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pieDataSet = PieDataSet(dataValues1(), "")
        pieDataSet.colors = colorClassArray

        val pieData = PieData(pieDataSet)
        pie_chart.data = pieData

        pie_chart.setDrawEntryLabels(true)
        pie_chart.setUsePercentValues(false)
        pie_chart.centerText = "Week Data"
        pie_chart.setCenterTextSize(24.00F)
        pie_chart.transparentCircleRadius = 40F
        pie_chart.setTransparentCircleColor(Color.RED)
        pie_chart.setTransparentCircleAlpha(20)

        pie_chart.invalidate()
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