package at.fh.swengb.loggingviewsandactivity

class Lesson(val id: String, val name: String, val date: String, val topic: String, val type: LessonType, val lecturers: List<Lecturer>, val ratings: MutableList<LessonRating> ) {
    fun ratingAverage(): Double {
        return ratings.map {it.ratingValue}.average()
    }

    override fun toString(): String {
        return "Lesson(id='$id', name='$name', date='$date', topic='$topic', type=$type, lecturers=$lecturers, ratings=$ratings)"
    }
}