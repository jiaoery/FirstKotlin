package reflect

import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.memberProperties


fun readMember(obj: Any) {
    //读取obj所有成员属性的名称和值
    obj::class.memberProperties.forEach {
        println("${obj::class.simpleName}.${it.name}=${it.getter.call(obj)}")
    }
}

fun modifyMember(obj: Any) {
    obj::class.memberProperties.forEach {
       if (it.name == "address"&&
               it is KMutableProperty1&&
                   it.setter.parameters.size == 2&&
                   it.getter.returnType.classifier == String::class
       ) {
           it.setter.call(obj, "China")
           println("======Address Changed.======")
       }
    }
}

fun main() {
    val student = Student("张三", 18, 178)
    val school = School("PKU", "Beijing...")
    readMember(student)
    readMember(school)
    modifyMember(school)
    readMember(school)
    readMember(student)
}