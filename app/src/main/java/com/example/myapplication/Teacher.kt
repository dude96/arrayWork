package com.example.myapplication

import android.util.Log

class Teacher:Person() {
    var studentList:ArrayList<Student> = ArrayList()
    var subjectTeaching:String = ""
    var averageStudentMarks:Double = 0.0

    fun addStudent(student: Student){
        studentList.add(student)
    }

    fun setStudentMark(index:Int, average:Double){
        if (index<0 || index>=studentList.size) return
        var student = studentList[index]
        student.average = average
    }

    fun getEnglishStudent():ArrayList<Student>{
        val sList = ArrayList<Student>()
        for (i in  0 until studentList.size){
            var correntStudent = studentList[i]
            if (correntStudent.subject == "English")
                sList.add(correntStudent)
        }
        return sList
    }

    fun getMathStudent():ArrayList<Student>{
        val mList = ArrayList<Student>()
        for (i in  0 until studentList.size){
            var correntStudent = studentList[i]
            if (correntStudent.subject == "Math")
                mList.add(correntStudent)
        }
        return mList
    }
    fun getStudentListAverage85():ArrayList<String> {
        val studentName = ArrayList<String>()
        for (i in 0 until studentList.size) {
            var up85 = studentList[i]
            var student = Student()
            student.name = "Name $i"
            if (up85.average > 85.0) {
                studentName.add(up85.toString())
                Log.d("tesssst", "${student.name}   is biger from 85  ${up85.average}")
            }
            else {
                Log.d("tesssst", "${student.name}   is smaller from 85 ${up85.average}")
            }
        }
        return studentName
    }
    //    fun getStudentListAverage85():ArrayList<String> {
//        var averageList = ArrayList<String>()
//        for (i in 0 until studentList.size) {
//            val currentStudent = studentList[i]
//            if (currentStudent.average > 85.0){
//                averageList.add(currentStudent.name)
//                var student = Student()
//                student.name = "Name $i"
//                Log.d("tesssst", "${student.name}   is biger from 85  ${currentStudent.average}")
//            }
//        }
//        return  averageList
//    }

    override fun getDescription(): String {
        return "This is a teacher named: $name"
    }

}
