package com.example.instagramcloneapp.Model

class Post {
    private  var  postid:String=""
    private  var  postimage:String=""
    private  var  description:String=""
    private  var  publisher:String=""

    constructor()
    constructor(postid: String, postimage: String, description: String, publisher: String) {
        this.postid = postid
        this.postimage = postimage
        this.description = description
        this.publisher = publisher
    }
    fun getPostid():String{
        return postid
    }
    fun getPostimage():String{
        return postimage
    }
    fun getDescription():String{
        return description
    }
    fun getPublisher():String{
        return publisher
    }
    fun setPostid(postid: String){
        this.postid=postid
    }
    fun setPostimage(postimage: String){
        this.postimage=postimage
    }
    fun setPublisher(publisher:String){
        this.publisher=publisher
    }
    fun setDescription(description:String){
        this.description=description
    }


}