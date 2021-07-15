package com.example.calibrationapp

import android.hardware.Sensor
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        lateinit var sensorManager: SensorManager
        sensorManager = getSystemService(SENSOR_SERVICE) as SensorManager
        sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE)

// лучше использовать вариант с проверкой
        if (sensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) != null) {
            // Успешно! У нас есть гироскоп
        } else {
            // Неудачно! Гироскоп не обнаружен
        }
        setContentView(R.layout.activity_main)

    }
}