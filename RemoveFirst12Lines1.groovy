// Import required classes
import java.util.Properties;
import java.io.InputStream;
import com.boomi.execution.ExecutionUtil

// Get input data stream
for( int i = 0; i < dataContext.getDataCount(); i++ ) {
    InputStream is = dataContext.getStream(i);
    Properties props = dataContext.getProperties(i);
    
    // Copy the input stream data as a String
    String data = dataContext.getStream(i).text;
    
    // Split the data based on new lines
    lines = data.split('\n')
    
    // Remove the first 12 lines and join the data with new lines
    newContent = lines.drop(12).join('\n')
    
    // Convert the manipulated data back to input stream
    is = new ByteArrayInputStream(newContent.getBytes());
    
    dataContext.storeStream(is, props);
}