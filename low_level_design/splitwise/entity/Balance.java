package low_level_design.splitwise.entity;

public record Balance(
        String debtorId,
        String creditorId,
        long amount
) {


}
