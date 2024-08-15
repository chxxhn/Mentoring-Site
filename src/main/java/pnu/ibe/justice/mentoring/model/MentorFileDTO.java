package pnu.ibe.justice.mentoring.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


public class MentorFileDTO {

    private Long seqId;

    @NotNull
    @Size(max = 255)
    private String fileSrc;

    private Long mentor;

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(final Long seqId) {
        this.seqId = seqId;
    }

    public String getFileSrc() {
        return fileSrc;
    }

    public void setFileSrc(final String fileSrc) {
        this.fileSrc = fileSrc;
    }

    public Long getMentor() {
        return mentor;
    }

    public void setMentor(final Long mentor) {
        this.mentor = mentor;
    }

}
