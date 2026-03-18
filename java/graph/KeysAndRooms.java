// 841. Keys and Rooms
// https://leetcode.com/problems/keys-and-rooms/description/

import java.util.*;

class Solution {
    void bfs(int start,List<List<Integer>> rooms,boolean[] vis){
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        while(q.size() > 0){
            int front = q.remove();
            for(int ele:rooms.get(front)){
                if(!vis[ele]){
                    q.add(ele);
                    vis[ele] = true;
                }
            }
        }

    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
    int n = rooms.size();
    boolean[] vis = new boolean[n];
    vis[0] = true;
    bfs(0,rooms,vis);
    for(boolean b:vis){
        if(b == false){
            return false;
        }
    }
    return true;
    }
}






public class KeysAndRooms {
    public static void main (String[] args) {
    List<List<Integer>> rooms = List.of(
            List.of(1, 3),
            List.of(3, 0, 1),
            List.of(2),
            List.of(0)
        );

    Solution sol = new Solution();
    System.out.println(sol.canVisitAllRooms(rooms));
    }
}

