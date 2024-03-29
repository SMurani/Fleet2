package fleet.car.action;

        import java.io.File;
        import java.io.FileOutputStream;
        import java.io.InputStream;

        import org.apache.commons.fileupload.FileItemStream;

/**
 * Created by sammy on 7/26/16.
 */

public class Upload {

    public static boolean processFile (String path, FileItemStream item){
        try{
            File f = new File ("/home/sammy/work/Fleet2/src/main/webapp/uploads");
            if (!f.exists())f.mkdir();
            File savedFile = new File(f.getAbsolutePath()+File.separator+ item.getName());
            FileOutputStream fos  = new FileOutputStream (savedFile);
            InputStream is = item.openStream();
            int x = 0;
            byte [] b = new byte [1024];

            while ((x=is.read(b))!= -1){
                fos.write(b, 0, x);
            }
            fos.flush();
            fos.close();
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
