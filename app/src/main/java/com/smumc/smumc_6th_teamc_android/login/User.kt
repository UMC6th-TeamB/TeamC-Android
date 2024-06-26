package com.smumc.smumc_6th_teamc_android.login

import androidx.room.Entity
import androidx.room.PrimaryKey

// 데이터 클래스: 사용자 정보
@Entity(tableName = "UserTable")
data class User(
    var studentId : String, //학번
    var password : String //비번
){
    @PrimaryKey(autoGenerate = true) var id : Int = 0
}
