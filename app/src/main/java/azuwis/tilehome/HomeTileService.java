package azuwis.tilehome;

import android.content.Intent;
import android.service.quicksettings.TileService;

public class HomeTileService extends TileService {
    @Override
    public void onClick() {
        super.onClick();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
    }
}
