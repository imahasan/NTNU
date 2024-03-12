package no.ntnu.tdt4250.group13.timetable.servletsupport;

import java.util.Collection;

import org.osgi.annotation.versioning.ProviderType;

@ProviderType
public interface IRequestPathResolver {
	public Object getObjectForPath(Collection<? extends Object> rootObjects, String... segments);
}
