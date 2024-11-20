import java.lang.Math

def integracion(f: (Double => Double), a: Double, b: Double): Double = {
  val (media: Double) = (a + b) / 2
  (b - a) * ((f(a) + 4 * f(media) + f(b)) / 6)
}

val f: Double => Double = (x: Double) => 1/(Math.sqrt(x - 1))

def error (x : Double, y: Double) : Double = (x - y).abs

val valEsperado = 0.828427
val valObtenido = integracion(f, 2, 3)

error(valObtenido, valEsperado)