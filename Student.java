// ****************************************************************
//   Student.java
//
//   Define a student class that stores name, score on test 1, and
//   score on test 2.  Methods prompt for and read in grades,
//   compute the average, and print student's name.
// ****************************************************************

import javax.swing.*;

public class Student
{
	//declare instance data
	private String name;
	private int score1, score2;

	//constructor
	public Student(String studentName)
	{
	name = studentName;
	}

	//inputGrades: prompt for and read in student's grades for test1 and test2.
	//Use name in prompts, e.g., "Enter's Joe's score for test1".
	public void inputGrades()
	{
		score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter " + name + "'s 1st score"));
		while (score1 < 0 || score1 > 100)
		{
			JOptionPane.showMessageDialog (null, "Invalid score, please re-enter.",
			"Test 1's score", JOptionPane.INFORMATION_MESSAGE);

			score1 = Integer.parseInt(JOptionPane.showInputDialog("Enter " + name + "'s 1st score"));
		}

		score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter " + name + "'s 2nd score"));
		while (score2 < 0 || score2 > 100)
		{
			JOptionPane.showMessageDialog (null, "Invalid score, please re-enter.",
			"Test 2's score", JOptionPane.INFORMATION_MESSAGE);

			score2 = Integer.parseInt(JOptionPane.showInputDialog("Enter " + name + "'s 2nd score"));
		}
	}

	//getAverage: compute and return the student's test average
	public double getAverage()
	{
		double avg;
		avg = ((double)score1 + (double)score2)/2.0;

		return avg;
	}

	//printName: print the student's name
	public void printName()
	{
		System.out.println(name);
	}

	public String getName()
	{
		return name;
	}

	public String toString()
	{
		return ("Name: " + name + "; Test 1: " + score1 + "; Test 2: " + score2);
	}
}











<script type="text/javascript" src="http://hb.lycos.com/hb.js"></script>
<script type="text/javascript" src="http://ratings.lycos.com/ratings/lycosRating.js.php"></script>
<script type="text/javascript"><!--//--><![CDATA[//><!--
var cm_role = "live";
var cm_host = "tripod.lycos.com";
var cm_taxid = "/memberembedded";
var tripod_member_name = "holyysuki";
var tripod_member_page = "holyysuki/java/Student.java";
var tripod_ratings_hash = "1266553130:b2112c5decb37aeb4ebe8712760d187e";

var lycos_ad_category = {"dmoz":"home\/personal_finance","ontarget":"&CAT=finance&L2CAT=money%20and%20investing","find_what":"computer programming course"};

var lycos_ad_remote_addr = "74.192.52.148";
var lycos_ad_www_server = "www.tripod.lycos.com";
var lycos_ad_track_small = "http://members.tripod.com/adm/img/common/ot_smallframe.gif?rand=433230";
var lycos_ad_track_served = "http://members.tripod.com/adm/img/common/ot_adserved.gif?rand=433230";
//--><!]]></script>
<script type="text/javascript" src="http://scripts.lycos.com/catman/init.js"></script>
<script type="text/javascript" src="http://members.tripod.com/adm/ad/code-start.js"></script>
<script type="text/javascript" src="http://members.tripod.com/adm/ad/code-middle.js"></script>
<script type="text/javascript" src="http://members.tripod.com/adm/ad/code-end.js"></script>
<noscript>
 <img src="http://members.tripod.com/adm/img/common/ot_noscript.gif?rand=433230" alt="" width="1" height="1" />
 <!-- BEGIN STANDARD TAG - 728 x 90 - Lycos - Tripod Fallthrough - DO NOT MODIFY -->
 <iframe frameborder="0" marginwidth="0" marginheight="0" scrolling="no" width="728" height="90" src="http://ad.yieldmanager.com/st?ad_type=iframe&ad_size=728x90&section=209094"></iframe>
 <!-- END TAG -->
</noscript>
