package model;

public class AdminDepartment extends SuperDepartment{
	public String departmentName()
	{
		return "Admin Department";
	}
	public String getTodayWork()
	{
		return "Complete your document submission";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
}
