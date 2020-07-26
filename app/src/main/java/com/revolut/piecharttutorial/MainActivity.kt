package com.revolut.piecharttutorial

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pieChartView = PieChartView(this)
        pie_chart.data = pieChartView.pieData

        pie_chart.setDrawEntryLabels(true)
        pie_chart.setUsePercentValues(false)
        pie_chart.centerText = "Week Data"
        pie_chart.setCenterTextSize(24.00F)
        pie_chart.transparentCircleRadius = 40F
        pie_chart.setTransparentCircleColor(Color.RED)
        pie_chart.setTransparentCircleAlpha(20)

        pie_chart.invalidate()
    }


}