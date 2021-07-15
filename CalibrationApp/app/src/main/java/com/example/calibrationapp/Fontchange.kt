package com.example.calibrationapp
import android.content.Context
import android.graphics.Typeface
import java.lang.Exception
import android. util.Log

class Fontchange {
    companion object {
        private val  fontchange:HashMap<String, Typeface> = HashMap()
        fun getTypeFace(fontName: String, context: Context): Typeface? {
            var typeface= fontchange[fontName]
            if (typeface == null){
                try { typeface= Typeface.createFromAsset(context.assets,fontName)
            } catch (e:Exception){
                    Log.e("Get typeface error", e.message)
                    return null
                }
                fontchange[fontName]=typeface
                }
            return typeface
        }

    }
}