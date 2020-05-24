package mx.edu.ittepic.ladm_u4_practica2_gonzalezcruz

import android.graphics.BitmapFactory
import android.graphics.Canvas
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity):View(p){
    var puntero = p
    var masterSword = BitmapFactory.decodeResource(resources,R.drawable.mastersword)
    var fondo = BitmapFactory.decodeResource(resources,R.drawable.fondo)
    var masterSword2 = Dibujo(masterSword,0,800)
    var fondo2 = Dibujo(fondo,0,0)
    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        var paint = Paint()
        fondo2.pintar(c,paint)
        masterSword2.pintar(c,paint)
    }
}