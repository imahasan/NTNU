package no.ntnu.tdt4250.group13.timetable.servletsupport;

import java.util.Map;

public interface IPostHandler {
	public Object handlePostBody(Object root, String postBody, Map<String, Object> params) throws RuntimeException;
}
