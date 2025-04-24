
package socialappdeneme;


public class SocialAppDeneme {

    
    public static void main(String[] args) {
        
        User bilge = new User("bilgemng","bilge","bilge44","female",21);
        User kerem = new User("keremoz","kerem","kerem78","male",20);
        User helin = new User("helinhrmn","helin","helin21","female",20);
        
        bilge.follow(kerem);
        bilge.follow(helin);
        System.out.println("Number of Bilge's followers : "+bilge.followersCount());
        System.out.println("Number of Bilge's followed : "+bilge.followedCount());
        
        System.out.println("Number of Kerem's followers : "+kerem.followersCount());
        System.out.println("Number of Kerem's followed : "+kerem.followedCount());
        
        Post p1 = new Post("hello world");
        helin.posts.add(p1);
        bilge.like(p1);
        kerem.like(p1);
        System.out.println("Number of p1 likers : "+p1.likers.size());
        System.out.println("P1 posttext : "+p1.postText);
        
        
    }
    
}
