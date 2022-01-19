package com.kotlincurso.teste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        corCheck.setOnClickListener(this)

    }

    override fun onClick(v: View) {

        val id = v.id

        if(id == R.id.corCheck){
            handleColor()
        }
    }

    fun handleColor(){
        if(corCheck.isChecked){
            iconImage.setColorFilter(resources.getColor(R.color.orange))
        }else{
            iconImage.setColorFilter(resources.getColor(R.color.black))
        }
    }
}