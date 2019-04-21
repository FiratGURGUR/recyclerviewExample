package firat.gurgur.recyclerview;

public class UserModel {

    private String userName;
    private String userSurname;
    private String userMail;
    private String userPhotoUrl;
    private String userDetail;
    private String userAge;
    private String userJob;

    public UserModel(String userName, String userSurname, String userMail, String userPhotoUrl, String userDetail, String userAge, String userJob) {
        this.userName = userName;
        this.userSurname = userSurname;
        this.userMail = userMail;
        this.userPhotoUrl = userPhotoUrl;
        this.userDetail = userDetail;
        this.userAge = userAge;
        this.userJob = userJob;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPhotoUrl() {
        return userPhotoUrl;
    }

    public void setUserPhotoUrl(String userPhotoUrl) {
        this.userPhotoUrl = userPhotoUrl;
    }

    public String getUserDetail() {
        return userDetail;
    }

    public void setUserDetail(String userDetail) {
        this.userDetail = userDetail;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }
}
