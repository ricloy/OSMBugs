package org.gittner.osmbugs.api;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.gittner.osmbugs.bugs.KeeprightBug;
import org.gittner.osmbugs.parser.KeeprightParser;
import org.gittner.osmbugs.statics.Settings;
import org.osmdroid.util.BoundingBoxE6;

import java.io.IOException;
import java.util.ArrayList;

public class KeeprightApi implements BugApi<KeeprightBug>
{
    @Override
    public ArrayList<KeeprightBug> downloadBBox(BoundingBoxE6 bBox)
    {
        return downloadBBox(
                bBox,
                Settings.Keepright.isShowIgnoredEnabled(),
                Settings.Keepright.isShowTempIgnoredEnabled(),
                Settings.isLanguageGerman()
        );
    }


    private ArrayList<KeeprightBug> downloadBBox(
            BoundingBoxE6 bBox,
            boolean showIgnored,
            boolean showTempIgnored,
            boolean langGerman)
    {
        HttpClient client = new DefaultHttpClient();

        ArrayList<NameValuePair> arguments = new ArrayList<>();

        if (showIgnored)
        {
            arguments.add(new BasicNameValuePair("show_ign", "1"));
        }
        else
        {
            arguments.add(new BasicNameValuePair("show_ign", "0"));
        }

        if (showTempIgnored)
        {
            arguments.add(new BasicNameValuePair("show_tmpign", "1"));
        }
        else
        {
            arguments.add(new BasicNameValuePair("show_tmpign", "0"));
        }

        arguments.add(new BasicNameValuePair("ch", getKeeprightSelectionString()));
        arguments.add(new BasicNameValuePair("lat", String.valueOf(bBox.getCenter().getLatitudeE6() / 1000000.0)));
        arguments.add(new BasicNameValuePair("lon", String.valueOf(bBox.getCenter().getLongitudeE6() / 1000000.0)));

        if (langGerman)
        {
            arguments.add(new BasicNameValuePair("lang", "de"));
        }

        HttpGet request = new HttpGet("http://keepright.ipax.at/points.php?" + URLEncodedUtils.format(arguments, "utf-8"));
        try
        {
            /* Execute Query */
            HttpResponse response = client.execute(request);

            /* Check for Success */
            if (response.getStatusLine().getStatusCode() != 200)
            {
                return null;
            }

            /* If Request was Successful, parse the Stream */
            return KeeprightParser.parse(response.getEntity().getContent());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return null;
    }


    private String getKeeprightSelectionString()
    {
        /* Unknown what 0 stands for but its for compatibility Reasons */
        String result = "0,";
        if (Settings.Keepright.is20Enabled())
        {
            result += "20,";
        }
        if (Settings.Keepright.is30Enabled())
        {
            result += "30,";
        }
        if (Settings.Keepright.is40Enabled())
        {
            result += "40,";
        }
        if (Settings.Keepright.is50Enabled())
        {
            result += "50,";
        }
        if (Settings.Keepright.is60Enabled())
        {
            result += "60,";
        }
        if (Settings.Keepright.is70Enabled())
        {
            result += "70,";
        }
        if (Settings.Keepright.is90Enabled())
        {
            result += "90,";
        }
        if (Settings.Keepright.is100Enabled())
        {
            result += "100,";
        }
        if (Settings.Keepright.is110Enabled())
        {
            result += "110,";
        }
        if (Settings.Keepright.is120Enabled())
        {
            result += "120,";
        }
        if (Settings.Keepright.is130Enabled())
        {
            result += "130,";
        }
        if (Settings.Keepright.is150Enabled())
        {
            result += "150,";
        }
        if (Settings.Keepright.is160Enabled())
        {
            result += "160,";
        }
        if (Settings.Keepright.is170Enabled())
        {
            result += "170,";
        }
        if (Settings.Keepright.is180Enabled())
        {
            result += "180,";
        }
        if (Settings.Keepright.is190Enabled())
        {
            if (Settings.Keepright.is191Enabled())
            {
                result += "191,";
            }
            if (Settings.Keepright.is192Enabled())
            {
                result += "192,";
            }
            if (Settings.Keepright.is193Enabled())
            {
                result += "193,";
            }
            if (Settings.Keepright.is194Enabled())
            {
                result += "194,";
            }
            if (Settings.Keepright.is195Enabled())
            {
                result += "195,";
            }
            if (Settings.Keepright.is196Enabled())
            {
                result += "196,";
            }
            if (Settings.Keepright.is197Enabled())
            {
                result += "197,";
            }
            if (Settings.Keepright.is198Enabled())
            {
                result += "198,";
            }
        }
        if (Settings.Keepright.is200Enabled())
        {
            if (Settings.Keepright.is201Enabled())
            {
                result += "201,";
            }
            if (Settings.Keepright.is202Enabled())
            {
                result += "202,";
            }
            if (Settings.Keepright.is203Enabled())
            {
                result += "203,";
            }
            if (Settings.Keepright.is204Enabled())
            {
                result += "204,";
            }
            if (Settings.Keepright.is205Enabled())
            {
                result += "205,";
            }
            if (Settings.Keepright.is206Enabled())
            {
                result += "206,";
            }
            if (Settings.Keepright.is207Enabled())
            {
                result += "207,";
            }
            if (Settings.Keepright.is208Enabled())
            {
                result += "208,";
            }
        }
        if (Settings.Keepright.is210Enabled())
        {
            result += "210,";
        }
        if (Settings.Keepright.is220Enabled())
        {
            result += "220,";
        }
        if (Settings.Keepright.is230Enabled())
        {
            if (Settings.Keepright.is231Enabled())
            {
                result += "231,";
            }
            if (Settings.Keepright.is232Enabled())
            {
                result += "232,";
            }
        }
        if (Settings.Keepright.is270Enabled())
        {
            result += "270,";
        }
        if (Settings.Keepright.is280Enabled())
        {
            if (Settings.Keepright.is281Enabled())
            {
                result += "281,";
            }
            if (Settings.Keepright.is282Enabled())
            {
                result += "282,";
            }
            if (Settings.Keepright.is283Enabled())
            {
                result += "283,";
            }
            if (Settings.Keepright.is284Enabled())
            {
                result += "284,";
            }
            if (Settings.Keepright.is285Enabled())
            {
                result += "285,";
            }
        }
        if (Settings.Keepright.is290Enabled())
        {
            if (Settings.Keepright.is291Enabled())
            {
                result += "291,";
            }
            if (Settings.Keepright.is292Enabled())
            {
                result += "292,";
            }
            if (Settings.Keepright.is293Enabled())
            {
                result += "293,";
            }
            if (Settings.Keepright.is294Enabled())
            {
                result += "294,";
            }
        }
        if (Settings.Keepright.is300Enabled())
        {
            result += "300,";
        }
        if (Settings.Keepright.is310Enabled())
        {
            if (Settings.Keepright.is311Enabled())
            {
                result += "311,";
            }
            if (Settings.Keepright.is312Enabled())
            {
                result += "312,";
            }
            if (Settings.Keepright.is313Enabled())
            {
                result += "313,";
            }
        }
        if (Settings.Keepright.is320Enabled())
        {
            result += "320,";
        }
        if (Settings.Keepright.is350Enabled())
        {
            result += "350,";
        }
        if (Settings.Keepright.is360Enabled())
        {
            result += "360,";
        }
        if (Settings.Keepright.is370Enabled())
        {
            result += "370,";
        }
        if (Settings.Keepright.is380Enabled())
        {
            result += "380,";
        }
        if (Settings.Keepright.is390Enabled())
        {
            result += "390,";
        }
        if (Settings.Keepright.is400Enabled())
        {
            if (Settings.Keepright.is401Enabled())
            {
                result += "401,";
            }
            if (Settings.Keepright.is402Enabled())
            {
                result += "402,";
            }
        }
        if (Settings.Keepright.is410Enabled())
        {
            if (Settings.Keepright.is411Enabled())
            {
                result += "411,";
            }
            if (Settings.Keepright.is412Enabled())
            {
                result += "412,";
            }
            if (Settings.Keepright.is413Enabled())
            {
                result += "413,";
            }
        }
        if (result.endsWith(","))
        {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }


    public boolean comment(int schema, int id, String comment, KeeprightBug.STATE state)
    {
        HttpClient client = new DefaultHttpClient();

        ArrayList<NameValuePair> arguments = new ArrayList<>();

        arguments.add(new BasicNameValuePair("co", comment));

        switch (state)
        {
            case OPEN:
                arguments.add(new BasicNameValuePair("st", "open"));
                break;

            case IGNORED:
                arguments.add(new BasicNameValuePair("st", "ignore"));
                break;

            case IGNORED_TMP:
                arguments.add(new BasicNameValuePair("st", "ignore_t"));
                break;
        }

        arguments.add(new BasicNameValuePair("schema", String.valueOf(schema)));
        arguments.add(new BasicNameValuePair("id", String.valueOf(id)));

        HttpGet request = new HttpGet("http://keepright.at/comment.php?" + URLEncodedUtils.format(arguments, "utf-8"));
        try
        {
            /* Execute commit */
            HttpResponse response = client.execute(request);

            /* Check result for Success */
            if (response.getStatusLine().getStatusCode() != 200)
            {
                return false;
            }
        }
        catch (ClientProtocolException e)
        {
            e.printStackTrace();
            return false;
        }
        catch (IOException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
