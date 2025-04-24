
package socialappdeneme;

import java.util.ArrayList;


public class Post {
    
    public String postText;
    public ArrayList<User> likers;
    
    Post(String postText){
        
        this.postText=postText;
        this.likers= new ArrayList();
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }
    public void writePost(){
        System.out.println("Text post: "+this.postText);
    }
    
    
    
    
    
    
    
    
}
