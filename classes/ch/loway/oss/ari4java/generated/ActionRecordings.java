package ch.loway.oss.ari4java.generated;

// ----------------------------------------------------
//      THIS CLASS WAS GENERATED AUTOMATICALLY         
//               PLEASE DO NOT EDIT                    
//    Generated on: Sat Nov 01 15:52:13 CET 2014
// ----------------------------------------------------

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import ch.loway.oss.ari4java.tools.RestException;
import ch.loway.oss.ari4java.tools.AriCallback;

public interface ActionRecordings {

// void mute String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(String recordingName, AriCallback<Void> callback);



// StoredRecording getStored String
/**********************************************************
 * Get a stored recording's details.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public StoredRecording getStored(String recordingName) throws RestException;



// LiveRecording getLive String
/**********************************************************
 * List live recordings.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public LiveRecording getLive(String recordingName) throws RestException;



// void unpause String
/**********************************************************
 * Unpause a live recording.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unpause(String recordingName) throws RestException;



// void pause String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void pause(String recordingName, AriCallback<Void> callback);



// void deleteStored String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void deleteStored(String recordingName, AriCallback<Void> callback);



// void cancel String
/**********************************************************
 * Stop a live recording and discard it.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void cancel(String recordingName) throws RestException;



// void cancel String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void cancel(String recordingName, AriCallback<Void> callback);



// void unmute String
/**********************************************************
 * Unmute a live recording.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(String recordingName) throws RestException;



// void deleteStored String
/**********************************************************
 * Delete a stored recording.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void deleteStored(String recordingName) throws RestException;



// void listStored AriCallback<List<? extends StoredRecording>> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void listStored(AriCallback<List<? extends StoredRecording>> callback);



// void unpause String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unpause(String recordingName, AriCallback<Void> callback);



// void pause String
/**********************************************************
 * Pause a live recording.
 * Pausing a recording suspends silence detection, which will be restarted when the recording is unpaused. Paused time is not included in the accounting for maxDurationSeconds.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void pause(String recordingName) throws RestException;



// StoredRecording copyStored String String
/**********************************************************
 * Copy a stored recording.
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public StoredRecording copyStored(String recordingName, String destinationRecordingName) throws RestException;



// void getLive String AriCallback<LiveRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getLive(String recordingName, AriCallback<LiveRecording> callback);



// void mute String
/**********************************************************
 * Mute a live recording.
 * Muting a recording suspends silence detection, which will be restarted when the recording is unmuted.
 * 
 * @since ari_0_0_1
 *********************************************************/
public void mute(String recordingName) throws RestException;



// void copyStored String String AriCallback<StoredRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_1_5_0
 *********************************************************/
public void copyStored(String recordingName, String destinationRecordingName, AriCallback<StoredRecording> callback);



// void getStored String AriCallback<StoredRecording> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void getStored(String recordingName, AriCallback<StoredRecording> callback);



// void stop String
/**********************************************************
 * Stop a live recording and store it.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stop(String recordingName) throws RestException;



// void unmute String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void unmute(String recordingName, AriCallback<Void> callback);



// List<? extends StoredRecording> listStored
/**********************************************************
 * List recordings that are complete.
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public List<? extends StoredRecording> listStored() throws RestException;



// void stop String AriCallback<Void> callback
/**********************************************************
 * 
 * 
 * @since ari_0_0_1
 *********************************************************/
public void stop(String recordingName, AriCallback<Void> callback);


}
;
