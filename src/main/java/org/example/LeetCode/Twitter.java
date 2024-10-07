package org.example.LeetCode;

import java.util.*;

class Tweet implements Comparable<Tweet>{
    int time;
    int tweetId;

    Tweet(int time, int tweetId){
        this.time = time;
        this.tweetId = tweetId;
    }

    public int compareTo(Tweet that){
        return that.time - this.time;
    }
}

class User{
    int userId;
    HashSet<Integer> followers;
    List<Tweet> tweetList;
    User(int userId){
        this.userId = userId;
        followers = new HashSet<>();
        tweetList = new LinkedList<>();
    }

    public void addTweet(Tweet tweet){
        tweetList.add(0,tweet);
    }

    public void addFollower(int followedId){
        followers.add(followedId);
    }

    public void removeFollowers(int followedId){
        followers.remove(followedId);
    }
}


public class Twitter {
    HashMap<Integer, User> userHashMap;
    int timeCounter;
    public Twitter(){
        userHashMap = new HashMap<>();
        timeCounter=0;
    }

    public void postTweet(int userId, int tweetId) {
        timeCounter++;
        if (!userHashMap.containsKey(userId)){
            userHashMap.put(userId, new User(userId));
        }
        User user = userHashMap.get(userId);
        user.addTweet(new Tweet(timeCounter, tweetId));
    }

    public List<Integer> getNewsFeed(int userId) {
        if(!userHashMap.containsKey(userId)){
            return new ArrayList<>();
        }
        PriorityQueue<Tweet> pq = new PriorityQueue<>();
        User user = userHashMap.get(userId);
        for (int followerId : user.followers){
            int count = 0;
            for(Tweet tweet: userHashMap.get(followerId).tweetList){
                pq.offer(tweet);
                count++;
                if(count>10){
                    break;
                }
            }
        }
        int count = 0;
        for (Tweet tweet: user.tweetList){
            pq.offer(tweet);
            count++;
            if (count>10){
                break;
            }
        }
        List<Integer> list = new ArrayList<>();
        int index = 0;
        while (!pq.isEmpty() && index < 10){
            Tweet tweet = pq.poll();
            list.add(tweet.tweetId);
            index++;
        }
        return list;
    }
    public void follow(int followerId, int followeeId) {
        if(!userHashMap.containsKey(followerId)){
            userHashMap.put(followerId, new User(followerId));
        }
        if(!userHashMap.containsKey(followeeId)){
            userHashMap.put(followeeId, new User(followeeId));
        }
        User user = userHashMap.get(followerId);
        user.addFollower(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if(!userHashMap.containsKey(followerId) || !userHashMap.containsKey(followeeId)) {
            return;
        }
        User user = userHashMap.get(followerId);
        user.removeFollowers(followeeId);
    }
}
