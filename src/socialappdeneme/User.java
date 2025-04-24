
package socialappdeneme;

import java.util.ArrayList;

public class User {
    
    String userName;
    String name;
    String password;
    String gender;
    int age;
    ArrayList<User> followers;
    ArrayList<User> followed;
    ArrayList<Post> posts;
    ArrayList<Post> likedPost;
    
    
    User(String userName, String name, String password, String gender, int age){
        
        this.userName=userName;
        this.name=name;
        this.password=password;
        this.gender=gender;
        this.age=age;
        this.followed=new ArrayList<User>();
        this.followers=new ArrayList<User>();
        this.posts=new ArrayList<Post>();
        this.likedPost=new ArrayList<Post>();
    }
    
    public String getUserName(){
      return this.userName;  
    }
    public void setUserName(String userName){
        this.userName=userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public void follow(User u){
        this.followed.add(u);
        u.followers.add(this);
    }
    
    public void addPost(Post p){
        this.posts.add(p);
    }
   
    public void like(Post p){
        p.likers.add(this);
        this.likedPost.add(p);
    }
    
    public void writeAllPosts(){
        
        for(int i=0; i<posts.size() ; i++){
            posts.get(i).writePost();
        }
    }
    public int followedCount(){
       return this.followed.size();
    }
    public int followersCount(){
        return this.followers.size();
    }
    
}
