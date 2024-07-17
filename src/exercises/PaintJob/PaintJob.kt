package exercises.PaintJob

import kotlin.math.ceil

fun getBucketCount(width: Double, height: Double, areaPerBucket: Double, extraBuckets: Int): Int {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) return -1
    return ceil((width*height)/areaPerBucket).toInt()-extraBuckets
}

fun getBucketCount(width: Double, height: Double, areaPerBucket: Double): Int {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0) return -1
    return ceil(( width*height)/areaPerBucket).toInt()
}

fun getBucketCount(area: Double, areaPerBucket: Double): Int {
    if (area <= 0 || areaPerBucket <= 0) return -1
    return ceil(area/areaPerBucket).toInt()
}


fun main(){
    println(getBucketCount(-3.4, 2.1, 1.5, 2))
    println(getBucketCount(3.4, 2.1, 1.5, 2))
    println(getBucketCount(2.75, 3.25, 2.5, 1))
    println(getBucketCount(-3.4, 2.1, 1.5))
    println(getBucketCount(3.4, 2.1, 1.5))
    println(getBucketCount(7.25, 4.3, 2.35))
    println(getBucketCount(3.4,1.5))
    println(getBucketCount(6.26, 2.2))
    println(getBucketCount(3.26, 0.75))
}