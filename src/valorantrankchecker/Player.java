package valorantrankchecker;
public class Player {
    final private String name;
    final private String tag;
    final private String rankName;
    final private int rankTier;
    final private int rankRating;
    final private int elo;
    final private int mmrChangeLastGame;
    final private boolean isOld;

    public Player(String name, String tag, String rankName, int rankTier, int rankRating, int elo,
            int mmrChangeLastGame, boolean isOld) {
        this.name = name;
        this.tag = tag;
        this.rankName = rankName;
        this.rankTier = rankTier;
        this.rankRating = rankRating;
        this.elo = elo;
        this.mmrChangeLastGame = mmrChangeLastGame;
        this.isOld = isOld;
    }


    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getRankName() {
        return rankName;
    }

    public int getRankTier() {
        return rankTier;
    }

    public int getRankRating() {
        return rankRating;
    }

    public int getElo() {
        return elo;
    }

    public int getMmrChangeLastGame() {
        return mmrChangeLastGame;
    }

    public boolean isOld() {
        return isOld;
    }

    
}




