public class Photo {
    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnailUrl;

    public Photo(int albumId, int id, String title, String url, String thumbnailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbnailUrl = thumbnailUrl;
    }

    public int getAlbumId() {
        return this.albumId;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public int getId() {
        return id;
    }
}
