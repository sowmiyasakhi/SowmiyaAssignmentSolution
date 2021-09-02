package model;

public class HRDepartment extends SuperDepartment{
	public String departmentName()
	{
		return "HR Department";
	}
	public String getTodayWork()
	{
		return "Fill todays worksheet and mark your attendance";
	}
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
	public String doActivity()
	{
		return "Team Lunch";
	}
}
