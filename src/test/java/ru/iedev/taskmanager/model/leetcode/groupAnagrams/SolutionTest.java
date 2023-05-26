package ru.iedev.taskmanager.model.leetcode.groupAnagrams;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void groupAnagrams() {
        List<List<String>> anagramList = new Solution().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        anagramList.stream().forEach(strings -> System.out.println(strings));

        List<List<String>> anagramList1 = new Solution().groupAnagrams(new String[]{""});
        anagramList1.stream().forEach(strings -> System.out.println(strings));

        List<List<String>> anagramList2 = new Solution().groupAnagrams(new String[]{"a"});
        anagramList2.stream().forEach(strings -> System.out.println(strings));

        List<List<String>> anagramList3 = new Solution().groupAnagrams(new String[]{"nozzle","punjabi","waterlogged","imprison","crux","numismatists","sultans","rambles","deprecating","aware","outfield","marlborough","guardrooms","roast","wattage","shortcuts","confidential","reprint","foxtrot","dispossession","floodgate","unfriendliest","semimonthlies","dwellers","walkways","wastrels","dippers","engrossing","undertakings","unforeseen","oscilloscopes","pioneers","geller","neglects","cultivates","mantegna","elicit","couriered","shielded","shrew","heartening","lucks","teammates","jewishness","documentaries","subliming","sultan","redo","recopy","flippancy","rothko","conductor","e","carolingian","outmanoeuvres","gewgaw","saki","sarah","snooping","hakka","highness","mewling","spender","blockhead","detonated","cognac","congaing","prissy","loathes","bluebell","involuntary","aping","sadly","jiving","buffalo","chided","instalment","boon","ashikaga","enigmas","recommenced"});
        anagramList3.stream().forEach(strings -> System.out.println(strings));

    }
}