package qkikakiood.com.hwadapters.cmn;

import android.graphics.drawable.Drawable;
import android.widget.Button;

public class Post {

    private String headline;
    private Drawable postPicture;
    private boolean btnUp;
    private boolean btnDown;
    private Button btnComment;
    private Button btnShare;
    private int numPoints;
    private int numComments;
    private Button btnMore;

    public Post(String headline, Drawable postPicture, boolean btnUp, boolean btnDown, int numPoints, int numComments) {
        this.headline = headline;
        this.postPicture = postPicture;
        this.btnUp = btnUp;
        this.btnDown = btnDown;
        this.numPoints = numPoints;
        this.numComments = numComments;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Drawable getPostPicture() {
        return postPicture;
    }

    public void setPostPicture(Drawable postPicture) {
        this.postPicture = postPicture;
    }

    public boolean isBtnUp() {
        return btnUp;
    }

    public void setBtnUp(boolean btnUp) {
        this.btnUp = btnUp;
    }

    public boolean isBtnDown() {
        return btnDown;
    }

    public void setBtnDown(boolean btnDown) {
        this.btnDown = btnDown;
    }

    public Button getBtnComment() {
        return btnComment;
    }

    public void setBtnComment(Button btnComment) {
        this.btnComment = btnComment;
    }

    public Button getBtnShare() {
        return btnShare;
    }

    public void setBtnShare(Button btnShare) {
        this.btnShare = btnShare;
    }

    public int getNumPoints() {
        return numPoints;
    }

    public void setNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }

    public int getNumComments() {
        return numComments;
    }

    public void setNumComments(int numComments) {
        this.numComments = numComments;
    }

    public Button getBtnMore() {
        return btnMore;
    }

    public void setBtnMore(Button btnMore) {
        this.btnMore = btnMore;
    }
}
