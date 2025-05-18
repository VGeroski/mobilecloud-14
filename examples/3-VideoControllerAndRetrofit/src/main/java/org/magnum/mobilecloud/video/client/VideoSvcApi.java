package org.magnum.mobilecloud.video.client;

import java.util.List;

import org.magnum.mobilecloud.video.controller.Video;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * This interface defines an API for a VideoSvc. The
 * interface is used to provide a contract for client/server
 * interactions. The interface is annotated with Retrofit
 * annotations so that clients can automatically convert the
 * interface into a client object. See VideoSvcClientApiTest
 * for an example of how Retrofit is used to turn this interface
 * into a client.
 * 
 * @author jules
 *
 */
public interface VideoSvcApi {
	
	// The path where we expect the VideoSvc to live
    String VIDEO_SVC_PATH = "/video";

	@GET(VIDEO_SVC_PATH)
    List<Video> getVideoList();
	
	@POST(VIDEO_SVC_PATH)
    boolean addVideo(@Body Video v);
	
}
