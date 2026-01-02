package seleniumpractice;

import org.pojo.AdactinLogin;
import org.sel.BaseClass;

public class CommonLocatorrun extends BaseClass {

    static void main(String[] args) {


        browserLaunch();
        launchUrl("https://adactinhotelapp.com/");


        AdactinLogin adlog = new AdactinLogin();

        CustomizedXpathWithAttribute(adlog.getAllElementwithattribute(),
                "username", "divya2829");

        CustomizedXpathWithAttribute(adlog.getAllElementwithattribute(),
                "password", "drithi@2608");

        click(adlog.getAdtLoginBtn());

    }

}
