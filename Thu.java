package doan;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Thu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cmttext="<div class=\"comment_item width_common\" data-time=\"1505090014\"><p class=\"full_content\">Anh yêu em, hãy bảo vệ anh hihi...</p><div class=\"user_status width_common\"><a class=\"avata_coment\" href=\"javascript:;\"></a><span class=\"left txt_666 txt_14\"><a class=\"nickname txt_666\" href=\"javascript:;\" title=\"\"><b>Võ hoàn</b></a> - 07:33 11/09</span><p class=\"txt_666 right block_like_web\"><a id=\"23027057\" class=\"txt_blue txt_11 link_reply\" href=\"javascript:;\" rel=\"23027057\" parent=\"23027057\"><i class=\"ic ic-reply\">&nbsp;</i> <b>Trả lời</b></a> &nbsp;|&nbsp;<a id=\"23027057\" class=\"txt_666 txt_11 link_thich\" href=\"javascript:;\" rel=\"23027057\">Quan tâm&nbsp;<i class=\"ic ic-like\"></i></a>&nbsp;<a class=\"txt_666 txt_11 total_like\" href=\"javascript:;\">1,081</a>&nbsp;|&nbsp;<a class=\"txt_blue txt_11 report_bad\" rel=\"23027057\" href=\"#\" title=\"Vi phạm\" alt=\"Vi phạm\">Vi phạm</a>&nbsp;|&nbsp;<a href=\"javascript:;\" rel=\"23027057\" class=\"share_cmt_fb txt_blue txt_11\">Chia sẻ <i class=\"ic ic-caret-down\"></i></a></p></div><div class=\"sub_comment width_common clearfix\"><div class=\"sub_comment_item width_common\"><p class=\"full_content\">Anh khôn thế!!!</p><div class=\"user_status width_common\"><a class=\"avata_coment\" href=\"javascript:;\"></a><span class=\"left txt_666 txt_14\"><a class=\"nickname txt_666\" href=\"javascript:;\" title=\"\"><b>Võ hồn</b></a> - 07:43 11/09</span><p class=\"txt_666 right block_like_web\"><a id=\"23027182\" class=\"txt_blue txt_11 link_reply\" href=\"javascript:;\" rel=\"23027182\" parent=\"23027057\"><i class=\"ic ic-reply\">&nbsp;</i> <b>Trả lời</b></a> &nbsp;|&nbsp;<a id=\"23027182\" class=\"txt_666 txt_11 link_thich\" href=\"javascript:;\" rel=\"23027182\">Quan tâm&nbsp;<i class=\"ic ic-like\"></i></a>&nbsp;<a class=\"txt_666 txt_11 total_like\" href=\"javascript:;\">286</a>&nbsp;|&nbsp;<a class=\"txt_blue txt_11 report_bad\" rel=\"23027182\" href=\"#\" title=\"Vi phạm\" alt=\"Vi phạm\">Vi phạm</a>&nbsp;|&nbsp;<a href=\"javascript:;\" rel=\"23027182\" class=\"share_cmt_fb txt_blue txt_11\">Chia sẻ <i class=\"ic ic-caret-down\"></i></a></p></div></div><div class=\"sub_comment_item width_common end\"><p class=\"full_content\">Đàn ông con trai gì mà \"trói gà không chặt\".... giống tui:)) Ngoan, em đã thuộc về anh.</p><div class=\"user_status width_common\"><a class=\"avata_coment\" href=\"javascript:;\"></a><span class=\"left txt_666 txt_14\"><a class=\"nickname txt_666 hover\" href=\"javascript:;\" title=\"\"><b>Trần Chiến Thắng</b></a> - 08:01 11/09</span><p class=\"txt_666 right block_like_web\"><a id=\"23027407\" class=\"txt_blue txt_11 link_reply\" href=\"javascript:;\" rel=\"23027407\" parent=\"23027057\"><i class=\"ic ic-reply\">&nbsp;</i> <b>Trả lời</b></a> &nbsp;|&nbsp;<a id=\"23027407\" class=\"txt_666 txt_11 link_thich\" href=\"javascript:;\" rel=\"23027407\">Quan tâm&nbsp;<i class=\"ic ic-like\"></i></a>&nbsp;<a class=\"txt_666 txt_11 total_like\" href=\"javascript:;\">354</a>&nbsp;|&nbsp;<a class=\"txt_blue txt_11 report_bad\" rel=\"23027407\" href=\"#\" title=\"Vi phạm\" alt=\"Vi phạm\">Vi phạm</a>&nbsp;|&nbsp;<a href=\"javascript:;\" rel=\"23027407\" class=\"share_cmt_fb txt_blue txt_11\">Chia sẻ <i class=\"ic ic-caret-down\"></i></a></p></div></div><div class=\"txt_view_more width_common\"><a href=\"#\" class=\"txt_blue view_all_reply\" rel=\"23027057\" data-total=\" 18\" data-offset=\"1\">Xem tất cả 18 trả lời</a></div></div></div>";
		System.out.println("Pattern 1");
		String pattern ="<p class=\"full_content\">(.+?)</p>";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(cmttext);
		String cmString = null;
		while(m.find())
		{
			System.out.println(m.group(0));
			cmString += m.group(0);
		}
		System.out.println(cmString);
		
		System.out.println("Pattern 2");
		pattern =">(.+?)<";
		p = Pattern.compile(pattern);
		m = p.matcher(cmString);
		String cmString2 = "";
		ArrayList<String> arr_list1 = new ArrayList<>();
		while(m.find())
		{
			cmString2 = m.group(0);
			arr_list1.add(cmString2);
			cmString2 = "";
		}
		System.out.println(arr_list1);
		
		
		// Patern 3
		System.out.println("Pattern 3");
		String pat = "[^><]";
		p = Pattern.compile(pat);
		String cmString3 = "";
		ArrayList<String> arr_list2 = new ArrayList<>();
		for (String string : arr_list1) {
			m = p.matcher(string);
			while(m.find())
			{
				System.out.println(m.group(0));
				arr_list2.add(m.group(0));
			}
		}
		
		System.out.println("KQ");
		
		for (String string : arr_list2) {
			System.out.println(string);
		}
	}

}
