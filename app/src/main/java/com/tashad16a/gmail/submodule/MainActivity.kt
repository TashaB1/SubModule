package com.tashad16a.gmail.submodule

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToastBye(view: View){
        //создаём и отображаем текстовое уведомление
        val toast = Toast.makeText(
            this,
            "Goodbye world!",
            Toast.LENGTH_LONG  //(По умолчанию) показывает текстовое уведомление на короткий промежуток времени
        )
        toast.setGravity(Gravity.CENTER, 0, 0);   //позиция на экране
        toast.show()
    }
}
