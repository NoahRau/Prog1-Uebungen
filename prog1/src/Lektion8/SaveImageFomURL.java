package Lektion8;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class SaveImageFomURL {

    public static void main(String[] args) throws IOException
    {
        String seite = "<body id=\"www-wikipedia-org\">"
                + "<div class=\"central-textlogo\">"
                + "<img src=\"https://upload.wikimedia.org/wikipedia/commons/thumb"
                + "/b/bb/Wikipedia_wordmark.svg/174px-Wikipedia_wordmark.svg.png\">"
                + "</div>"
                + "</body>";
        String downloadUrl = "//<ihre ausgeschnittene URL>";


        int startIndex = seite.indexOf("<img src=\"");
        if (startIndex != (-1))
        {
            startIndex = startIndex + "<img src=\"".length();
            int endIndex = seite.indexOf('\"', startIndex);
            downloadUrl  = seite.substring(startIndex, endIndex);
            System.out.println(downloadUrl);
        }

            URL url = new URL(downloadUrl);


        BufferedImage image = ImageIO.read(url);
        ImageIO.write(image, "png", new File("bild.png"));
    }

}
