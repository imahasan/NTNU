package no.ntnu.tdt4250.group13.timetable.servletsupport;

import java.util.Collection;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface IRequestQueryExecutor {
	public Object getRequestQueryResult(Collection<?> target, String op, Map<String, ?> parameters);
}
