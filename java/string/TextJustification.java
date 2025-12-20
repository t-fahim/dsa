// 68. Text Justification
// https://leetcode.com/problems/text-justification/description/

import java.util.*;

class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> lines = new ArrayList<>();
        int index = 0;
        while(index < words.length){
            int count = words[index].length();
            int last = index + 1;
            while(last<words.length){
                if(count +1 +words[last].length() > maxWidth){
                    break;
                }
                count += 1+ words[last].length();
                last++;
            }
            StringBuilder builder = new StringBuilder();
            builder.append(words[index]);
            int diff = last - index - 1;

            // for last line or the line has only one word,left-justify
            if (last == words.length || diff == 0){
                for(int i=index+1;i<last;i++){
                    builder.append(" ");
                    builder.append(words[i]);
                }
                for(int i = builder.length();i<maxWidth;i++){
                    builder.append(" ");
                }
            }
            else{
                // calculate space
                int spaces = (maxWidth - count) / diff;
                int extraSpace = (maxWidth - count) % diff;
                for(int i = index+1;i<last;i++){
                    for(int s = spaces;s>0;s--){
                        builder.append(" ");
                    }
                    if(extraSpace > 0){
                        builder.append(" ");
                        extraSpace--;
                    }
                    builder.append(" ");
                    builder.append(words[i]);
                }
            }
            lines.add(builder.toString());
            index = last;
        }
        return lines;
    }
}





public class TextJustification {
    public static void main (String[] args) {
    String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
    int maxWidth = 16;

    Solution sol = new Solution();
    List<String> result = sol.fullJustify(words, maxWidth);
    System.out.println(result);
    }
}

