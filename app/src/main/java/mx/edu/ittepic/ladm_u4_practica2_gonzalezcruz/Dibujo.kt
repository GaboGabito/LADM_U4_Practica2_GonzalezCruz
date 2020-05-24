package mx.edu.ittepic.ladm_u4_practica2_gonzalezcruz

import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.view.MotionEvent

class Dibujo(){
    var x=0f
    var y = 0f
    var ancho = 0f
    var alto = 0f
    var incx = 0
    var incy = 0
    var tipo = 0
    var b : Bitmap?=null
    var res :Resources?=null
    var invisible = false

    constructor(b: Bitmap, x:Int, y: Int):this(){
        this.b = b
        this.x = x.toFloat()
        this.y = y.toFloat()
        ancho = b!!.width.toFloat()
        alto = b!!.height.toFloat()
        tipo = 3
    }

    fun pintar(c: Canvas, p: Paint){
        if(!this.invisible){
            when(tipo) {
                3 -> {
                    c.drawBitmap(b!!, x, y, p)
                }
            }
        }

    }
    fun hacerInvisible(){
        this.invisible = true
    }
    fun deshacerInvisible(){
        this.invisible = false
    }

    fun asignarX(x: Int){
        this.x = x.toFloat()
    }


}