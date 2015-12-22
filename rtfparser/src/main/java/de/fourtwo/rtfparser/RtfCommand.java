package de.fourtwo.rtfparser;

import java.util.HashMap;
import java.util.Map;

/**
 * Enumeration of all RTF commands.
 */
public enum RtfCommand {
    hex("'", RtfCommandType.Symbol),

    optionalhyphen("-", RtfCommandType.Symbol),

    optionalcommand("*", RtfCommandType.Symbol),

    indexsubentry(":", RtfCommandType.Symbol),

    backslash("\\", RtfCommandType.Symbol),

    nonbreakinghyphen("_", RtfCommandType.Symbol),

    opencurly("{", RtfCommandType.Symbol),

    formula("|", RtfCommandType.Symbol),

    closecurly("}", RtfCommandType.Symbol),

    nonbreakingspace("~", RtfCommandType.Symbol),

    ab("ab", RtfCommandType.Toggle),

    absh("absh", RtfCommandType.Value),

    abslock("abslock", RtfCommandType.Flag),

    absnoovrlp("absnoovrlp", RtfCommandType.Toggle),

    absw("absw", RtfCommandType.Value),

    acaps("acaps", RtfCommandType.Toggle),

    acccircle("acccircle", RtfCommandType.Toggle),

    acccomma("acccomma", RtfCommandType.Toggle),

    accdot("accdot", RtfCommandType.Toggle),

    accnone("accnone", RtfCommandType.Toggle),

    accunderdot("accunderdot", RtfCommandType.Toggle),

    acf("acf", RtfCommandType.Value),

    adeff("adeff", RtfCommandType.Value),

    additive("additive", RtfCommandType.Flag),

    adeflang("adeflang", RtfCommandType.Value),

    adjustright("adjustright", RtfCommandType.Flag),

    adn("adn", RtfCommandType.Value),

    aenddoc("aenddoc", RtfCommandType.Flag),

    aendnotes("aendnotes", RtfCommandType.Flag),

    aexpnd("aexpnd", RtfCommandType.Value),

    af("af", RtfCommandType.Value),

    afelev("afelev", RtfCommandType.Flag),

    afs("afs", RtfCommandType.Value),

    aftnbj("aftnbj", RtfCommandType.Flag),

    aftncn("aftncn", RtfCommandType.Destination),

    aftnnalc("aftnnalc", RtfCommandType.Flag),

    aftnnar("aftnnar", RtfCommandType.Flag),

    aftnnauc("aftnnauc", RtfCommandType.Flag),

    aftnnchi("aftnnchi", RtfCommandType.Flag),

    aftnnchosung("aftnnchosung", RtfCommandType.Flag),

    aftnncnum("aftnncnum", RtfCommandType.Flag),

    aftnndbar("aftnndbar", RtfCommandType.Flag),

    aftnndbnum("aftnndbnum", RtfCommandType.Flag),

    aftnndbnumd("aftnndbnumd", RtfCommandType.Flag),

    aftnndbnumk("aftnndbnumk", RtfCommandType.Flag),

    aftnndbnumt("aftnndbnumt", RtfCommandType.Flag),

    aftnnganada("aftnnganada", RtfCommandType.Flag),

    aftnngbnum("aftnngbnum", RtfCommandType.Flag),

    aftnngbnumd("aftnngbnumd", RtfCommandType.Flag),

    aftnngbnumk("aftnngbnumk", RtfCommandType.Flag),

    aftnngbnuml("aftnngbnuml", RtfCommandType.Flag),

    aftnnrlc("aftnnrlc", RtfCommandType.Flag),

    aftnnruc("aftnnruc", RtfCommandType.Flag),

    aftnnzodiac("aftnnzodiac", RtfCommandType.Flag),

    aftnnzodiacd("aftnnzodiacd", RtfCommandType.Flag),

    aftnnzodiacl("aftnnzodiacl", RtfCommandType.Flag),

    aftnrestart("aftnrestart", RtfCommandType.Flag),

    aftnrstcont("aftnrstcont", RtfCommandType.Flag),

    aftnsep("aftnsep", RtfCommandType.Destination),

    aftnsepc("aftnsepc", RtfCommandType.Destination),

    aftnstart("aftnstart", RtfCommandType.Value),

    aftntj("aftntj", RtfCommandType.Flag),

    ai("ai", RtfCommandType.Toggle),

    alang("alang", RtfCommandType.Value),

    allowfieldendsel("allowfieldendsel", RtfCommandType.Flag),

    allprot("allprot", RtfCommandType.Flag),

    alntblind("alntblind", RtfCommandType.Flag),

    alt("alt", RtfCommandType.Flag),

    animtext("animtext", RtfCommandType.Value),

    annotation("annotation", RtfCommandType.Destination),

    annotprot("annotprot", RtfCommandType.Flag),

    ansi("ansi", RtfCommandType.Encoding),

    ansicpg("ansicpg", RtfCommandType.Encoding),

    aoutl("aoutl", RtfCommandType.Toggle),

    ApplyBrkRules("ApplyBrkRules", RtfCommandType.Flag),

    ascaps("ascaps", RtfCommandType.Toggle),

    ashad("ashad", RtfCommandType.Toggle),

    asianbrkrule("asianbrkrule", RtfCommandType.Flag),

    aspalpha("aspalpha", RtfCommandType.Toggle),

    aspnum("aspnum", RtfCommandType.Toggle),

    astrike("astrike", RtfCommandType.Toggle),

    atnauthor("atnauthor", RtfCommandType.Destination),

    atndate("atndate", RtfCommandType.Destination),

    atnicn("atnicn", RtfCommandType.Destination),

    atnid("atnid", RtfCommandType.Destination),

    atnparent("atnparent", RtfCommandType.Destination),

    atnref("atnref", RtfCommandType.Destination),

    atntime("atntime", RtfCommandType.Destination),

    atrfend("atrfend", RtfCommandType.Destination),

    atrfstart("atrfstart", RtfCommandType.Destination),

    aul("aul", RtfCommandType.Toggle),

    auld("auld", RtfCommandType.Toggle),

    auldb("auldb", RtfCommandType.Toggle),

    aulnone("aulnone", RtfCommandType.Toggle),

    aulw("aulw", RtfCommandType.Toggle),

    aup("aup", RtfCommandType.Value),

    author("author", RtfCommandType.Destination),

    autofmtoverride("autofmtoverride", RtfCommandType.Flag),

    b("b", RtfCommandType.Toggle),

    background("background", RtfCommandType.Destination),

    bdbfhdr("bdbfhdr", RtfCommandType.Flag),

    bdrrlswsix("bdrrlswsix", RtfCommandType.Flag),

    bgbdiag("bgbdiag", RtfCommandType.Flag),

    bgcross("bgcross", RtfCommandType.Flag),

    bgdcross("bgdcross", RtfCommandType.Flag),

    bgdkbdiag("bgdkbdiag", RtfCommandType.Flag),

    bgdkcross("bgdkcross", RtfCommandType.Flag),

    bgdkdcross("bgdkdcross", RtfCommandType.Flag),

    bgdkfdiag("bgdkfdiag", RtfCommandType.Flag),

    bgdkhoriz("bgdkhoriz", RtfCommandType.Flag),

    bgdkvert("bgdkvert", RtfCommandType.Flag),

    bgfdiag("bgfdiag", RtfCommandType.Flag),

    bghoriz("bghoriz", RtfCommandType.Flag),

    bgvert("bgvert", RtfCommandType.Flag),

    bin("bin", RtfCommandType.Value),

    binfsxn("binfsxn", RtfCommandType.Value),

    binsxn("binsxn", RtfCommandType.Value),

    bkmkcolf("bkmkcolf", RtfCommandType.Value),

    bkmkcoll("bkmkcoll", RtfCommandType.Value),

    bkmkend("bkmkend", RtfCommandType.Destination),

    bkmkpub("bkmkpub", RtfCommandType.Flag),

    bkmkstart("bkmkstart", RtfCommandType.Destination),

    bliptag("bliptag", RtfCommandType.Value),

    blipuid("blipuid", RtfCommandType.Destination),

    blipupi("blipupi", RtfCommandType.Value),

    blue("blue", RtfCommandType.Value),

    bookfold("bookfold", RtfCommandType.Flag),

    bookfoldrev("bookfoldrev", RtfCommandType.Flag),

    bookfoldsheets("bookfoldsheets", RtfCommandType.Value),

    box("box", RtfCommandType.Flag),

    brdrart("brdrart", RtfCommandType.Value),

    brdrb("brdrb", RtfCommandType.Flag),

    brdrbar("brdrbar", RtfCommandType.Flag),

    brdrbtw("brdrbtw", RtfCommandType.Flag),

    brdrcf("brdrcf", RtfCommandType.Value),

    brdrdash("brdrdash", RtfCommandType.Flag),

    brdrdashd("brdrdashd", RtfCommandType.Flag),

    brdrdashdd("brdrdashdd", RtfCommandType.Flag),

    brdrdashdot("brdrdashdot", RtfCommandType.Flag),

    brdrdashdotdot("brdrdashdotdot", RtfCommandType.Flag),

    brdrdashdotstr("brdrdashdotstr", RtfCommandType.Flag),

    brdrdashsm("brdrdashsm", RtfCommandType.Flag),

    brdrdb("brdrdb", RtfCommandType.Flag),

    brdrdot("brdrdot", RtfCommandType.Flag),

    brdremboss("brdremboss", RtfCommandType.Flag),

    brdrengrave("brdrengrave", RtfCommandType.Flag),

    brdrframe("brdrframe", RtfCommandType.Flag),

    brdrhair("brdrhair", RtfCommandType.Flag),

    brdrinset("brdrinset", RtfCommandType.Flag),

    brdrl("brdrl", RtfCommandType.Flag),

    brdrnil("brdrnil", RtfCommandType.Flag),

    brdrnone("brdrnone", RtfCommandType.Flag),

    brdroutset("brdroutset", RtfCommandType.Flag),

    brdrr("brdrr", RtfCommandType.Flag),

    brdrs("brdrs", RtfCommandType.Flag),

    brdrsh("brdrsh", RtfCommandType.Flag),

    brdrt("brdrt", RtfCommandType.Flag),

    brdrtbl("brdrtbl", RtfCommandType.Flag),

    brdrth("brdrth", RtfCommandType.Flag),

    brdrthtnlg("brdrthtnlg", RtfCommandType.Flag),

    brdrthtnmg("brdrthtnmg", RtfCommandType.Flag),

    brdrthtnsg("brdrthtnsg", RtfCommandType.Flag),

    brdrtnthlg("brdrtnthlg", RtfCommandType.Flag),

    brdrtnthmg("brdrtnthmg", RtfCommandType.Flag),

    brdrtnthsg("brdrtnthsg", RtfCommandType.Flag),

    brdrtnthtnlg("brdrtnthtnlg", RtfCommandType.Flag),

    brdrtnthtnmg("brdrtnthtnmg", RtfCommandType.Flag),

    brdrtnthtnsg("brdrtnthtnsg", RtfCommandType.Flag),

    brdrtriple("brdrtriple", RtfCommandType.Flag),

    brdrw("brdrw", RtfCommandType.Value),

    brdrwavy("brdrwavy", RtfCommandType.Flag),

    brdrwavydb("brdrwavydb", RtfCommandType.Flag),

    brkfrm("brkfrm", RtfCommandType.Flag),

    brsp("brsp", RtfCommandType.Value),

    bullet("bullet", RtfCommandType.Symbol),

    buptim("buptim", RtfCommandType.Destination),

    bxe("bxe", RtfCommandType.Flag),

    caccentfive("caccentfive", RtfCommandType.Flag),

    caccentfour("caccentfour", RtfCommandType.Flag),

    caccentone("caccentone", RtfCommandType.Flag),

    caccentsix("caccentsix", RtfCommandType.Flag),

    caccentthree("caccentthree", RtfCommandType.Flag),

    caccenttwo("caccenttwo", RtfCommandType.Flag),

    cachedcolbal("cachedcolbal", RtfCommandType.Flag),

    caps("caps", RtfCommandType.Toggle),

    category("category", RtfCommandType.Destination),

    cb("cb", RtfCommandType.Value),

    cbackgroundone("cbackgroundone", RtfCommandType.Flag),

    cbackgroundtwo("cbackgroundtwo", RtfCommandType.Flag),

    cbpat("cbpat", RtfCommandType.Value),

    cchsN("cchs", RtfCommandType.Value),

    cell("cell", RtfCommandType.Symbol),

    cellx("cellx", RtfCommandType.Value),

    cf("cf", RtfCommandType.Value),

    cfollowedhyperlink("cfollowedhyperlink", RtfCommandType.Flag),

    cfpat("cfpat", RtfCommandType.Value),

    cgrid("cgrid", RtfCommandType.Value),

    charrsid("charrsid", RtfCommandType.Value),

    charscalex("charscalex", RtfCommandType.Value),

    chatn("chatn", RtfCommandType.Symbol),

    chbgbdiag("chbgbdiag", RtfCommandType.Flag),

    chbgcross("chbgcross", RtfCommandType.Flag),

    chbgdcross("chbgdcross", RtfCommandType.Flag),

    chbgdkbdiag("chbgdkbdiag", RtfCommandType.Flag),

    chbgdkcross("chbgdkcross", RtfCommandType.Flag),

    chbgdkdcross("chbgdkdcross", RtfCommandType.Flag),

    chbgdkfdiag("chbgdkfdiag", RtfCommandType.Flag),

    chbgdkhoriz("chbgdkhoriz", RtfCommandType.Flag),

    chbgdkvert("chbgdkvert", RtfCommandType.Flag),

    chbgfdiag("chbgfdiag", RtfCommandType.Flag),

    chbghoriz("chbghoriz", RtfCommandType.Flag),

    chbgvert("chbgvert", RtfCommandType.Flag),

    chbrdr("chbrdr", RtfCommandType.Flag),

    chcbpat("chcbpat", RtfCommandType.Value),

    chcfpat("chcfpat", RtfCommandType.Value),

    chdate("chdate", RtfCommandType.Symbol),

    chdpa("chdpa", RtfCommandType.Symbol),

    chdpl("chdpl", RtfCommandType.Symbol),

    chftn("chftn", RtfCommandType.Symbol),

    chftnsep("chftnsep", RtfCommandType.Symbol),

    chftnsepc("chftnsepc", RtfCommandType.Symbol),

    chpgn("chpgn", RtfCommandType.Symbol),

    chhres("chhres", RtfCommandType.Value),

    chshdng("chshdng", RtfCommandType.Value),

    chtime("chtime", RtfCommandType.Symbol),

    chyperlink("chyperlink", RtfCommandType.Flag),

    clbgbdiag("clbgbdiag", RtfCommandType.Flag),

    clbgcross("clbgcross", RtfCommandType.Flag),

    clbgdcross("clbgdcross", RtfCommandType.Flag),

    clbgdkbdiag("clbgdkbdiag", RtfCommandType.Flag),

    clbgdkcross("clbgdkcross", RtfCommandType.Flag),

    clbgdkdcross("clbgdkdcross", RtfCommandType.Flag),

    clbgdkfdiag("clbgdkfdiag", RtfCommandType.Flag),

    clbgdkhor("clbgdkhor", RtfCommandType.Flag),

    clbgdkvert("clbgdkvert", RtfCommandType.Flag),

    clbgfdiag("clbgfdiag", RtfCommandType.Flag),

    clbghoriz("clbghoriz", RtfCommandType.Flag),

    clbgvert("clbgvert", RtfCommandType.Flag),

    clbrdrb("clbrdrb", RtfCommandType.Flag),

    clbrdrl("clbrdrl", RtfCommandType.Flag),

    clbrdrr("clbrdrr", RtfCommandType.Flag),

    clbrdrt("clbrdrt", RtfCommandType.Flag),

    clcbpat("clcbpat", RtfCommandType.Value),

    clcbpatraw("clcbpatraw", RtfCommandType.Value),

    clcfpat("clcfpat", RtfCommandType.Value),

    clcfpatraw("clcfpatraw", RtfCommandType.Value),

    cldel("cldel", RtfCommandType.Flag),

    cldelauth("cldelauth", RtfCommandType.Value),

    cldeldttm("cldeldttm", RtfCommandType.Value),

    cldgll("cldgll", RtfCommandType.Flag),

    cldglu("cldglu", RtfCommandType.Flag),

    clFitText("clFitText", RtfCommandType.Flag),

    clftsWidth("clftsWidth", RtfCommandType.Value),

    clhidemark("clhidemark", RtfCommandType.Flag),

    clins("clins", RtfCommandType.Flag),

    clinsauth("clinsauth", RtfCommandType.Value),

    clinsdttm("clinsdttm", RtfCommandType.Value),

    clmgf("clmgf", RtfCommandType.Flag),

    clmrg("clmrg", RtfCommandType.Flag),

    clmrgd("clmrgd", RtfCommandType.Flag),

    clmrgdauth("clmrgdauth", RtfCommandType.Value),

    clmrgddttm("clmrgddttm", RtfCommandType.Value),

    clmrgdr("clmrgdr", RtfCommandType.Flag),

    clNoWrap("clNoWrap", RtfCommandType.Flag),

    clpadb("clpadb", RtfCommandType.Value),

    clpadfb("clpadfb", RtfCommandType.Value),

    clpadfl("clpadfl", RtfCommandType.Value),

    clpadfr("clpadfr", RtfCommandType.Value),

    clpadft("clpadft", RtfCommandType.Value),

    clpadl("clpadl", RtfCommandType.Value),

    clpadr("clpadr", RtfCommandType.Value),

    clpadt("clpadt", RtfCommandType.Value),

    clspb("clspb", RtfCommandType.Value),

    clspfb("clspfb", RtfCommandType.Value),

    clspfl("clspfl", RtfCommandType.Value),

    clspfr("clspfr", RtfCommandType.Value),

    clspft("clspft", RtfCommandType.Value),

    clspl("clspl", RtfCommandType.Value),

    clspr("clspr", RtfCommandType.Value),

    clspt("clspt", RtfCommandType.Value),

    clshdng("clshdng", RtfCommandType.Value),

    clshdngraw("clshdngraw", RtfCommandType.Value),

    clshdrawnil("clshdrawnil", RtfCommandType.Flag),

    clsplit("clsplit", RtfCommandType.Flag),

    clsplitr("clsplitr", RtfCommandType.Flag),

    cltxbtlr("cltxbtlr", RtfCommandType.Flag),

    cltxlrtb("cltxlrtb", RtfCommandType.Flag),

    cltxlrtbv("cltxlrtbv", RtfCommandType.Flag),

    cltxtbrl("cltxtbrl", RtfCommandType.Flag),

    cltxtbrlv("cltxtbrlv", RtfCommandType.Flag),

    clvertalb("clvertalb", RtfCommandType.Flag),

    clvertalc("clvertalc", RtfCommandType.Flag),

    clvertalt("clvertalt", RtfCommandType.Flag),

    clvmgf("clvmgf", RtfCommandType.Flag),

    clvmrg("clvmrg", RtfCommandType.Flag),

    clwWidth("clwWidth", RtfCommandType.Value),

    cmaindarkone("cmaindarkone", RtfCommandType.Flag),

    cmaindarktwo("cmaindarktwo", RtfCommandType.Flag),

    cmainlightone("cmainlightone", RtfCommandType.Flag),

    cmainlighttwo("cmainlighttwo", RtfCommandType.Flag),

    collapsed("collapsed", RtfCommandType.Flag),

    colnoN("colno", RtfCommandType.Value),

    colorschememapping("colorschememapping", RtfCommandType.Destination),

    colortbl("colortbl", RtfCommandType.Destination),

    cols("cols", RtfCommandType.Value),

    colsrN("colsr", RtfCommandType.Value),

    colsx("colsx", RtfCommandType.Value),

    column("column", RtfCommandType.Symbol),

    colwN("colw", RtfCommandType.Value),

    comment("comment", RtfCommandType.Destination),

    company("company", RtfCommandType.Destination),

    contextualspace("contextualspace", RtfCommandType.Flag),

    cpg("cpg", RtfCommandType.Value),

    crauth("crauth", RtfCommandType.Value),

    crdate("crdate", RtfCommandType.Value),

    creatim("creatim", RtfCommandType.Destination),

    cs("cs", RtfCommandType.Value),

    cshade("cshade", RtfCommandType.Value),

    ctextone("ctextone", RtfCommandType.Flag),

    ctexttwo("ctexttwo", RtfCommandType.Flag),

    ctint("ctint", RtfCommandType.Value),

    ctrl("ctrl", RtfCommandType.Flag),

    cts("cts", RtfCommandType.Value),

    cufi("cufi", RtfCommandType.Value),

    culi("culi", RtfCommandType.Value),

    curi("curi", RtfCommandType.Value),

    cvmme("cvmme", RtfCommandType.Flag),

    datafield("datafield", RtfCommandType.Destination),

    datastore("datastore", RtfCommandType.Destination),

    date("date", RtfCommandType.Flag),

    dbch("dbch", RtfCommandType.Flag),

    defchp("defchp", RtfCommandType.Destination),

    deff("deff", RtfCommandType.Value),

    defformat("defformat", RtfCommandType.Flag),

    deflang("deflang", RtfCommandType.Value),

    deflangfe("deflangfe", RtfCommandType.Value),

    defpap("defpap", RtfCommandType.Destination),

    defshp("defshp", RtfCommandType.Flag),

    deftab("deftab", RtfCommandType.Value),

    deleted("deleted", RtfCommandType.Toggle),

    delrsid("delrsid", RtfCommandType.Value),

    dfrauth("dfrauth", RtfCommandType.Value),

    dfrdate("dfrdate", RtfCommandType.Value),

    dfrmtxtx("dfrmtxtx", RtfCommandType.Value),

    dfrmtxty("dfrmtxty", RtfCommandType.Value),

    dfrstart("dfrstart", RtfCommandType.Value),

    dfrstop("dfrstop", RtfCommandType.Value),

    dfrxst("dfrxst", RtfCommandType.Value),

    dghorigin("dghorigin", RtfCommandType.Value),

    dghshow("dghshow", RtfCommandType.Value),

    dghspace("dghspace", RtfCommandType.Value),

    dgmargin("dgmargin", RtfCommandType.Flag),

    dgsnap("dgsnap", RtfCommandType.Flag),

    dgvorigin("dgvorigin", RtfCommandType.Value),

    dgvshow("dgvshow", RtfCommandType.Value),

    dgvspace("dgvspace", RtfCommandType.Value),

    dibitmap("dibitmap", RtfCommandType.Value),

    disabled("disabled", RtfCommandType.Toggle),

    dn("dn", RtfCommandType.Value),

    dntblnsbdb("dntblnsbdb", RtfCommandType.Flag),

    docmd("do", RtfCommandType.Destination),

    dobxcolumn("dobxcolumn", RtfCommandType.Flag),

    dobxmargin("dobxmargin", RtfCommandType.Flag),

    dobxpage("dobxpage", RtfCommandType.Flag),

    dobymargin("dobymargin", RtfCommandType.Flag),

    dobypage("dobypage", RtfCommandType.Flag),

    dobypara("dobypara", RtfCommandType.Flag),

    doccomm("doccomm", RtfCommandType.Destination),

    doctemp("doctemp", RtfCommandType.Flag),

    doctype("doctype", RtfCommandType.Value),

    docvar("docvar", RtfCommandType.Destination),

    dodhgtN("dodhgt", RtfCommandType.Value),

    dolock("dolock", RtfCommandType.Flag),

    donotembedlingdata("donotembedlingdata", RtfCommandType.Value),

    donotembedsysfont("donotembedsysfont", RtfCommandType.Value),

    donotshowcomments("donotshowcomments", RtfCommandType.Flag),

    donotshowinsdel("donotshowinsdel", RtfCommandType.Flag),

    donotshowmarkup("donotshowmarkup", RtfCommandType.Flag),

    donotshowprops("donotshowprops", RtfCommandType.Flag),

    dpaendhol("dpaendhol", RtfCommandType.Flag),

    dpaendlN("dpaendl", RtfCommandType.Value),

    dpaendsol("dpaendsol", RtfCommandType.Flag),

    dpaendwN("dpaendw", RtfCommandType.Value),

    dparc("dparc", RtfCommandType.Flag),

    dparcflipx("dparcflipx", RtfCommandType.Flag),

    dparcflipy("dparcflipy", RtfCommandType.Flag),

    dpastarthol("dpastarthol", RtfCommandType.Flag),

    dpastartlN("dpastartl", RtfCommandType.Value),

    dpastartsol("dpastartsol", RtfCommandType.Flag),

    dpastartwN("dpastartw", RtfCommandType.Value),

    dpcallout("dpcallout", RtfCommandType.Flag),

    dpcoaN("dpcoa", RtfCommandType.Value),

    dpcoaccent("dpcoaccent", RtfCommandType.Flag),

    dpcobestfit("dpcobestfit", RtfCommandType.Flag),

    dpcoborder("dpcoborder", RtfCommandType.Flag),

    dpcodabs("dpcodabs", RtfCommandType.Flag),

    dpcodbottom("dpcodbottom", RtfCommandType.Flag),

    dpcodcenter("dpcodcenter", RtfCommandType.Flag),

    dpcodescent("dpcodescent", RtfCommandType.Value),

    dpcodtop("dpcodtop", RtfCommandType.Flag),

    dpcolengthN("dpcolength", RtfCommandType.Value),

    dpcominusx("dpcominusx", RtfCommandType.Flag),

    dpcominusy("dpcominusy", RtfCommandType.Flag),

    dpcooffsetN("dpcooffset", RtfCommandType.Value),

    dpcosmarta("dpcosmarta", RtfCommandType.Flag),

    dpcotdouble("dpcotdouble", RtfCommandType.Flag),

    dpcotright("dpcotright", RtfCommandType.Flag),

    dpcotsingle("dpcotsingle", RtfCommandType.Flag),

    dpcottriple("dpcottriple", RtfCommandType.Flag),

    dpcountN("dpcount", RtfCommandType.Value),

    dpellipse("dpellipse", RtfCommandType.Flag),

    dpendgroup("dpendgroup", RtfCommandType.Flag),

    dpfillbgcbN("dpfillbgcb", RtfCommandType.Value),

    dpfillbgcgN("dpfillbgcg", RtfCommandType.Value),

    dpfillbgcrN("dpfillbgcr", RtfCommandType.Value),

    dpfillbggrayN("dpfillbggray", RtfCommandType.Value),

    dpfillbgpal("dpfillbgpal", RtfCommandType.Flag),

    dpfillfgcbN("dpfillfgcb", RtfCommandType.Value),

    dpfillfgcgN("dpfillfgcg", RtfCommandType.Value),

    dpfillfgcrN("dpfillfgcr", RtfCommandType.Value),

    dpfillfggrayN("dpfillfggray", RtfCommandType.Value),

    dpfillfgpal("dpfillfgpal", RtfCommandType.Flag),

    dpfillpatN("dpfillpat", RtfCommandType.Value),

    dpgroup("dpgroup", RtfCommandType.Flag),

    dpline("dpline", RtfCommandType.Flag),

    dplinecobN("dplinecob", RtfCommandType.Value),

    dplinecogN("dplinecog", RtfCommandType.Value),

    dplinecorN("dplinecor", RtfCommandType.Value),

    dplinedado("dplinedado", RtfCommandType.Flag),

    dplinedadodo("dplinedadodo", RtfCommandType.Flag),

    dplinedash("dplinedash", RtfCommandType.Flag),

    dplinedot("dplinedot", RtfCommandType.Flag),

    dplinegrayN("dplinegray", RtfCommandType.Value),

    dplinehollow("dplinehollow", RtfCommandType.Flag),

    dplinepal("dplinepal", RtfCommandType.Flag),

    dplinesolid("dplinesolid", RtfCommandType.Flag),

    dplinewN("dplinew", RtfCommandType.Value),

    dppolycountN("dppolycount", RtfCommandType.Value),

    dppolygon("dppolygon", RtfCommandType.Flag),

    dppolyline("dppolyline", RtfCommandType.Flag),

    dpptxN("dpptx", RtfCommandType.Value),

    dpptyN("dppty", RtfCommandType.Value),

    dprect("dprect", RtfCommandType.Flag),

    dproundr("dproundr", RtfCommandType.Flag),

    dpshadow("dpshadow", RtfCommandType.Flag),

    dpshadxN("dpshadx", RtfCommandType.Value),

    dpshadyN("dpshady", RtfCommandType.Value),

    dptxbtlr("dptxbtlr", RtfCommandType.Flag),

    dptxbx("dptxbx", RtfCommandType.Flag),

    dptxbxmarN("dptxbxmar", RtfCommandType.Value),

    dptxbxtext("dptxbxtext", RtfCommandType.Destination),

    dptxlrtb("dptxlrtb", RtfCommandType.Flag),

    dptxlrtbv("dptxlrtbv", RtfCommandType.Flag),

    dptxtbrl("dptxtbrl", RtfCommandType.Flag),

    dptxtbrlv("dptxtbrlv", RtfCommandType.Flag),

    dpxN("dpx", RtfCommandType.Value),

    dpxsizeN("dpxsize", RtfCommandType.Value),

    dpyN("dpy", RtfCommandType.Value),

    dpysizeN("dpysize", RtfCommandType.Value),

    dropcapliN("dropcapli", RtfCommandType.Value),

    dropcaptN("dropcapt", RtfCommandType.Value),

    ds("ds", RtfCommandType.Value),

    dxfrtext("dxfrtext", RtfCommandType.Value),

    dy("dy", RtfCommandType.Value),

    ebcend("ebcend", RtfCommandType.Destination),

    ebcstart("ebcstart", RtfCommandType.Destination),

    edmins("edmins", RtfCommandType.Value),

    embo("embo", RtfCommandType.Toggle),

    emdash("emdash", RtfCommandType.Symbol),

    emfblip("emfblip", RtfCommandType.Flag),

    emspace("emspace", RtfCommandType.Symbol),

    endash("endash", RtfCommandType.Symbol),

    enddoc("enddoc", RtfCommandType.Flag),

    endnhere("endnhere", RtfCommandType.Flag),

    endnotes("endnotes", RtfCommandType.Flag),

    enforceprot("enforceprot", RtfCommandType.Value),

    enspace("enspace", RtfCommandType.Symbol),

    expnd("expnd", RtfCommandType.Value),

    expndtwN("expndtw", RtfCommandType.Value),

    expshrtn("expshrtn", RtfCommandType.Flag),

    f("f", RtfCommandType.Value),

    faauto("faauto", RtfCommandType.Flag),

    facenter("facenter", RtfCommandType.Flag),

    facingp("facingp", RtfCommandType.Flag),

    factoidname("factoidname", RtfCommandType.Destination),

    fafixed("fafixed", RtfCommandType.Flag),

    fahang("fahang", RtfCommandType.Flag),

    falt("falt", RtfCommandType.Destination),

    faroman("faroman", RtfCommandType.Flag),

    favar("favar", RtfCommandType.Flag),

    fbias("fbias", RtfCommandType.Value),

    fbidi("fbidi", RtfCommandType.Flag),

    fbidis("fbidis", RtfCommandType.Flag),

    fbimajor("fbimajor", RtfCommandType.Flag),

    fbiminor("fbiminor", RtfCommandType.Flag),

    fchars("fchars", RtfCommandType.Destination),

    fcharset("fcharset", RtfCommandType.Value),

    fcs("fcs", RtfCommandType.Value),

    fdbmajor("fdbmajor", RtfCommandType.Flag),

    fdbminor("fdbminor", RtfCommandType.Flag),

    fdecor("fdecor", RtfCommandType.Flag),

    felnbrelev("felnbrelev", RtfCommandType.Flag),

    fetN("fet", RtfCommandType.Value),

    fetch("fetch", RtfCommandType.Flag),

    ffdefres("ffdefres", RtfCommandType.Value),

    ffdeftext("ffdeftext", RtfCommandType.Destination),

    ffentrymcr("ffentrymcr", RtfCommandType.Destination),

    ffexitmcr("ffexitmcr", RtfCommandType.Destination),

    ffformat("ffformat", RtfCommandType.Destination),

    ffhaslistbox("ffhaslistbox", RtfCommandType.Value),

    ffhelptext("ffhelptext", RtfCommandType.Destination),

    ffhps("ffhps", RtfCommandType.Value),

    ffl("ffl", RtfCommandType.Destination),

    ffmaxlen("ffmaxlen", RtfCommandType.Value),

    ffname("ffname", RtfCommandType.Destination),

    ffownhelp("ffownhelp", RtfCommandType.Value),

    ffownstat("ffownstat", RtfCommandType.Value),

    ffprot("ffprot", RtfCommandType.Value),

    ffrecalc("ffrecalc", RtfCommandType.Value),

    ffres("ffres", RtfCommandType.Value),

    ffsize("ffsize", RtfCommandType.Value),

    ffstattext("ffstattext", RtfCommandType.Destination),

    fftype("fftype", RtfCommandType.Value),

    fftypetxt("fftypetxt", RtfCommandType.Value),

    fhimajor("fhimajor", RtfCommandType.Flag),

    fhiminor("fhiminor", RtfCommandType.Flag),

    fi("fi", RtfCommandType.Value),

    fidN("fid", RtfCommandType.Value),

    field("field", RtfCommandType.Destination),

    file("file", RtfCommandType.Destination),

    filetbl("filetbl", RtfCommandType.Destination),

    fittext("fittext", RtfCommandType.Value),

    fjgothic("fjgothic", RtfCommandType.Flag),

    fjminchou("fjminchou", RtfCommandType.Flag),

    fldalt("fldalt", RtfCommandType.Flag),

    flddirty("flddirty", RtfCommandType.Flag),

    fldedit("fldedit", RtfCommandType.Flag),

    fldinst("fldinst", RtfCommandType.Destination),

    fldlock("fldlock", RtfCommandType.Flag),

    fldpriv("fldpriv", RtfCommandType.Flag),

    fldrslt("fldrslt", RtfCommandType.Destination),

    fldtype("fldtype", RtfCommandType.Destination),

    flomajor("flomajor", RtfCommandType.Flag),

    flominor("flominor", RtfCommandType.Flag),

    fmodern("fmodern", RtfCommandType.Flag),

    fn("fn", RtfCommandType.Value),

    fname("fname", RtfCommandType.Destination),

    fnetwork("fnetwork", RtfCommandType.Flag),

    fnil("fnil", RtfCommandType.Flag),

    fnonfilesys("fnonfilesys", RtfCommandType.Flag),

    fontemb("fontemb", RtfCommandType.Destination),

    fontfile("fontfile", RtfCommandType.Destination),

    fonttbl("fonttbl", RtfCommandType.Destination),

    footer("footer", RtfCommandType.Destination),

    footerf("footerf", RtfCommandType.Destination),

    footerl("footerl", RtfCommandType.Destination),

    footerr("footerr", RtfCommandType.Destination),

    footery("footery", RtfCommandType.Value),

    footnote("footnote", RtfCommandType.Destination),

    forceupgrade("forceupgrade", RtfCommandType.Flag),

    formdisp("formdisp", RtfCommandType.Flag),

    formfield("formfield", RtfCommandType.Destination),

    formprot("formprot", RtfCommandType.Flag),

    formshade("formshade", RtfCommandType.Flag),

    fosnum("fosnum", RtfCommandType.Value),

    fprq("fprq", RtfCommandType.Value),

    fracwidth("fracwidth", RtfCommandType.Flag),

    frelativeN("frelative", RtfCommandType.Value),

    frmtxbtlr("frmtxbtlr", RtfCommandType.Flag),

    frmtxlrtb("frmtxlrtb", RtfCommandType.Flag),

    frmtxlrtbv("frmtxlrtbv", RtfCommandType.Flag),

    frmtxtbrl("frmtxtbrl", RtfCommandType.Flag),

    frmtxtbrlv("frmtxtbrlv", RtfCommandType.Flag),

    froman("froman", RtfCommandType.Flag),

    fromhtml("fromhtml", RtfCommandType.Value),

    fromtext("fromtext", RtfCommandType.Flag),

    fs("fs", RtfCommandType.Value),

    fscript("fscript", RtfCommandType.Flag),

    fswiss("fswiss", RtfCommandType.Flag),

    ftech("ftech", RtfCommandType.Flag),

    ftnalt("ftnalt", RtfCommandType.Flag),

    ftnbj("ftnbj", RtfCommandType.Flag),

    ftncn("ftncn", RtfCommandType.Destination),

    ftnil("ftnil", RtfCommandType.Flag),

    ftnlytwnine("ftnlytwnine", RtfCommandType.Flag),

    ftnnalc("ftnnalc", RtfCommandType.Flag),

    ftnnar("ftnnar", RtfCommandType.Flag),

    ftnnauc("ftnnauc", RtfCommandType.Flag),

    ftnnchi("ftnnchi", RtfCommandType.Flag),

    ftnnchosung("ftnnchosung", RtfCommandType.Flag),

    ftnncnum("ftnncnum", RtfCommandType.Flag),

    ftnndbar("ftnndbar", RtfCommandType.Flag),

    ftnndbnum("ftnndbnum", RtfCommandType.Flag),

    ftnndbnumd("ftnndbnumd", RtfCommandType.Flag),

    ftnndbnumk("ftnndbnumk", RtfCommandType.Flag),

    ftnndbnumt("ftnndbnumt", RtfCommandType.Flag),

    ftnnganada("ftnnganada", RtfCommandType.Flag),

    ftnngbnum("ftnngbnum", RtfCommandType.Flag),

    ftnngbnumd("ftnngbnumd", RtfCommandType.Flag),

    ftnngbnumk("ftnngbnumk", RtfCommandType.Flag),

    ftnngbnuml("ftnngbnuml", RtfCommandType.Flag),

    ftnnrlc("ftnnrlc", RtfCommandType.Flag),

    ftnnruc("ftnnruc", RtfCommandType.Flag),

    ftnnzodiac("ftnnzodiac", RtfCommandType.Flag),

    ftnnzodiacd("ftnnzodiacd", RtfCommandType.Flag),

    ftnnzodiacl("ftnnzodiacl", RtfCommandType.Flag),

    ftnrestart("ftnrestart", RtfCommandType.Flag),

    ftnrstcont("ftnrstcont", RtfCommandType.Flag),

    ftnrstpg("ftnrstpg", RtfCommandType.Flag),

    ftnsep("ftnsep", RtfCommandType.Destination),

    ftnsepc("ftnsepc", RtfCommandType.Destination),

    ftnstart("ftnstart", RtfCommandType.Value),

    ftntj("ftntj", RtfCommandType.Flag),

    fttruetype("fttruetype", RtfCommandType.Flag),

    fvaliddos("fvaliddos", RtfCommandType.Flag),

    fvalidhpfs("fvalidhpfs", RtfCommandType.Flag),

    fvalidmac("fvalidmac", RtfCommandType.Flag),

    fvalidntfs("fvalidntfs", RtfCommandType.Flag),

    g("g", RtfCommandType.Destination),

    gcw("gcw", RtfCommandType.Value),

    generator("generator", RtfCommandType.Destination),

    green("green", RtfCommandType.Value),

    grfdocevents("grfdocevents", RtfCommandType.Value),

    gridtbl("gridtbl", RtfCommandType.Destination),

    gutter("gutter", RtfCommandType.Value),

    gutterprl("gutterprl", RtfCommandType.Flag),

    guttersxn("guttersxn", RtfCommandType.Value),

    header("header", RtfCommandType.Destination),

    headerf("headerf", RtfCommandType.Destination),

    headerl("headerl", RtfCommandType.Destination),

    headerr("headerr", RtfCommandType.Destination),

    headery("headery", RtfCommandType.Value),

    hich("hich", RtfCommandType.Flag),

    highlight("highlight", RtfCommandType.Value),

    hl("hl", RtfCommandType.Destination),

    hlfr("hlfr", RtfCommandType.Destination),

    hlinkbase("hlinkbase", RtfCommandType.Destination),

    hlloc("hlloc", RtfCommandType.Destination),

    hlsrc("hlsrc", RtfCommandType.Destination),

    horzdoc("horzdoc", RtfCommandType.Flag),

    horzsect("horzsect", RtfCommandType.Flag),

    horzvert("horzvert", RtfCommandType.Value),

    hr("hr", RtfCommandType.Value),

    hres("hres", RtfCommandType.Value),

    hrule("hrule", RtfCommandType.Flag),

    hsv("hsv", RtfCommandType.Destination),

    htmautsp("htmautsp", RtfCommandType.Flag),

    htmlbase("htmlbase", RtfCommandType.Flag),

    htmlrtf("htmlrtf", RtfCommandType.Toggle),

    htmltag("htmltag", RtfCommandType.Destination),

    hwelev("hwelev", RtfCommandType.Flag),

    hyphauto("hyphauto", RtfCommandType.Toggle),

    hyphcaps("hyphcaps", RtfCommandType.Toggle),

    hyphconsecN("hyphconsec", RtfCommandType.Value),

    hyphhotz("hyphhotz", RtfCommandType.Value),

    hyphpar("hyphpar", RtfCommandType.Toggle),

    i("i", RtfCommandType.Toggle),

    id("id", RtfCommandType.Value),

    ignoremixedcontent("ignoremixedcontent", RtfCommandType.Value),

    ilfomacatclnup("ilfomacatclnup", RtfCommandType.Value),

    ilvl("ilvl", RtfCommandType.Value),

    impr("impr", RtfCommandType.Toggle),

    indmirror("indmirror", RtfCommandType.Flag),

    indrlsweleven("indrlsweleven", RtfCommandType.Flag),

    info("info", RtfCommandType.Destination),

    insrsid("insrsid", RtfCommandType.Value),

    intbl("intbl", RtfCommandType.Flag),

    ipgp("ipgp", RtfCommandType.Value),

    irowband("irowband", RtfCommandType.Value),

    irow("irow", RtfCommandType.Value),

    itap("itap", RtfCommandType.Value),

    ixe("ixe", RtfCommandType.Flag),

    jcompress("jcompress", RtfCommandType.Flag),

    jexpand("jexpand", RtfCommandType.Flag),

    jis("jis", RtfCommandType.Flag),

    jpegblip("jpegblip", RtfCommandType.Flag),

    jsksu("jsksu", RtfCommandType.Flag),

    keep("keep", RtfCommandType.Flag),

    keepn("keepn", RtfCommandType.Flag),

    kerningN("kerning", RtfCommandType.Value),

    keycode("keycode", RtfCommandType.Destination),

    keywords("keywords", RtfCommandType.Destination),

    krnprsnet("krnprsnet", RtfCommandType.Flag),

    ksulang("ksulang", RtfCommandType.Value),

    jclisttab("jclisttab", RtfCommandType.Flag),

    landscape("landscape", RtfCommandType.Flag),

    lang("lang", RtfCommandType.Value),

    langfe("langfe", RtfCommandType.Value),

    langfenp("langfenp", RtfCommandType.Value),

    langnp("langnp", RtfCommandType.Value),

    lastrow("lastrow", RtfCommandType.Flag),

    latentstyles("latentstyles", RtfCommandType.Destination),

    lbr("lbr", RtfCommandType.Value),

    lchars("lchars", RtfCommandType.Destination),

    ldblquote("ldblquote", RtfCommandType.Symbol),

    level("level", RtfCommandType.Value),

    levelfollow("levelfollow", RtfCommandType.Value),

    levelindent("levelindent", RtfCommandType.Value),

    leveljc("leveljc", RtfCommandType.Value),

    leveljcn("leveljcn", RtfCommandType.Value),

    levellegal("levellegal", RtfCommandType.Value),

    levelnfc("levelnfc", RtfCommandType.Value),

    levelnfcn("levelnfcn", RtfCommandType.Value),

    levelnorestart("levelnorestart", RtfCommandType.Value),

    levelnumbers("levelnumbers", RtfCommandType.Destination),

    levelold("levelold", RtfCommandType.Value),

    levelpicture("levelpicture", RtfCommandType.Value),

    levelpicturenosize("levelpicturenosize", RtfCommandType.Flag),

    levelprev("levelprev", RtfCommandType.Value),

    levelprevspace("levelprevspace", RtfCommandType.Value),

    levelspace("levelspace", RtfCommandType.Value),

    levelstartat("levelstartat", RtfCommandType.Value),

    leveltemplateid("leveltemplateid", RtfCommandType.Value),

    leveltext("leveltext", RtfCommandType.Destination),

    lfolevel("lfolevel", RtfCommandType.Destination),

    li("li", RtfCommandType.Value),

    line("line", RtfCommandType.Symbol),

    linebetcol("linebetcol", RtfCommandType.Flag),

    linecont("linecont", RtfCommandType.Flag),

    linemod("linemod", RtfCommandType.Value),

    lineppage("lineppage", RtfCommandType.Flag),

    linerestart("linerestart", RtfCommandType.Flag),

    linestart("linestart", RtfCommandType.Value),

    linestarts("linestarts", RtfCommandType.Value),

    linex("linex", RtfCommandType.Value),

    linkself("linkself", RtfCommandType.Flag),

    linkstyles("linkstyles", RtfCommandType.Flag),

    linkval("linkval", RtfCommandType.Destination),

    lin("lin", RtfCommandType.Value),

    lisa("lisa", RtfCommandType.Value),

    lisb("lisb", RtfCommandType.Value),

    list("list", RtfCommandType.Destination),

    listhybrid("listhybrid", RtfCommandType.Flag),

    listid("listid", RtfCommandType.Value),

    listlevel("listlevel", RtfCommandType.Destination),

    listname("listname", RtfCommandType.Destination),

    listoverride("listoverride", RtfCommandType.Destination),

    listoverridecount("listoverridecount", RtfCommandType.Value),

    listoverrideformat("listoverrideformat", RtfCommandType.Value),

    listoverridestartat("listoverridestartat", RtfCommandType.Flag),

    listoverridetable("listoverridetable", RtfCommandType.Destination),

    listpicture("listpicture", RtfCommandType.Destination),

    listrestarthdn("listrestarthdn", RtfCommandType.Value),

    listsimple("listsimple", RtfCommandType.Value),

    liststyleid("liststyleid", RtfCommandType.Value),

    liststylename("liststylename", RtfCommandType.Destination),

    listtable("listtable", RtfCommandType.Destination),

    listtemplateid("listtemplateid", RtfCommandType.Value),

    listtext("listtext", RtfCommandType.Destination),

    lnbrkrule("lnbrkrule", RtfCommandType.Flag),

    lndscpsxn("lndscpsxn", RtfCommandType.Flag),

    lnongrid("lnongrid", RtfCommandType.Flag),

    loch("loch", RtfCommandType.Flag),

    lquote("lquote", RtfCommandType.Symbol),

    ls("ls", RtfCommandType.Value),

    lsdlocked("lsdlocked", RtfCommandType.Value),

    lsdlockeddef("lsdlockeddef", RtfCommandType.Value),

    lsdlockedexcept("lsdlockedexcept", RtfCommandType.Destination),

    lsdpriority("lsdpriority", RtfCommandType.Value),

    lsdprioritydef("lsdprioritydef", RtfCommandType.Value),

    lsdqformat("lsdqformat", RtfCommandType.Value),

    lsdqformatdef("lsdqformatdef", RtfCommandType.Value),

    lsdsemihidden("lsdsemihidden", RtfCommandType.Value),

    lsdsemihiddendef("lsdsemihiddendef", RtfCommandType.Value),

    lsdstimax("lsdstimax", RtfCommandType.Value),

    lsdunhideused("lsdunhideused", RtfCommandType.Value),

    lsdunhideuseddef("lsdunhideuseddef", RtfCommandType.Value),

    ltrch("ltrch", RtfCommandType.Flag),

    ltrdoc("ltrdoc", RtfCommandType.Flag),

    ltrmark("ltrmark", RtfCommandType.Symbol),

    ltrpar("ltrpar", RtfCommandType.Flag),

    ltrrow("ltrrow", RtfCommandType.Flag),

    ltrsect("ltrsect", RtfCommandType.Flag),

    lvltentative("lvltentative", RtfCommandType.Flag),

    lytcalctblwd("lytcalctblwd", RtfCommandType.Flag),

    lytexcttp("lytexcttp", RtfCommandType.Flag),

    lytprtmet("lytprtmet", RtfCommandType.Flag),

    lyttblrtgr("lyttblrtgr", RtfCommandType.Flag),

    mac("mac", RtfCommandType.Encoding),

    macc("macc", RtfCommandType.Destination),

    maccPr("maccPr", RtfCommandType.Destination),

    macpict("macpict", RtfCommandType.Flag),

    mailmerge("mailmerge", RtfCommandType.Destination),

    makebackup("makebackup", RtfCommandType.Flag),

    maln("maln", RtfCommandType.Destination),

    malnScr("malnScr", RtfCommandType.Destination),

    manager("manager", RtfCommandType.Destination),

    margb("margb", RtfCommandType.Value),

    margbsxn("margbsxn", RtfCommandType.Value),

    margl("margl", RtfCommandType.Value),

    marglsxn("marglsxn", RtfCommandType.Value),

    margmirror("margmirror", RtfCommandType.Flag),

    margmirsxn("margmirsxn", RtfCommandType.Flag),

    margPr("margPr", RtfCommandType.Destination),

    margr("margr", RtfCommandType.Value),

    margrsxn("margrsxn", RtfCommandType.Value),

    margSz("margSz", RtfCommandType.Value),

    margt("margt", RtfCommandType.Value),

    margtsxn("margtsxn", RtfCommandType.Value),

    mbar("mbar", RtfCommandType.Destination),

    mbarPr("mbarPr", RtfCommandType.Destination),

    mbaseJc("mbaseJc", RtfCommandType.Destination),

    mbegChr("mbegChr", RtfCommandType.Destination),

    mborderBox("mborderBox", RtfCommandType.Destination),

    mborderBoxPr("mborderBoxPr", RtfCommandType.Destination),

    mbox("mbox", RtfCommandType.Destination),

    mboxPr("mboxPr", RtfCommandType.Destination),

    mbrk("mbrk", RtfCommandType.Value),

    mbrkBin("mbrkBin", RtfCommandType.Value),

    mbrkBinSub("mbrkBinSub", RtfCommandType.Value),

    mcGp("mcGp", RtfCommandType.Value),

    mcGpRule("mcGpRule", RtfCommandType.Value),

    mchr("mchr", RtfCommandType.Destination),

    mcount("mcount", RtfCommandType.Destination),

    mcSp("mcSp", RtfCommandType.Value),

    mctrlPr("mctrlPr", RtfCommandType.Destination),

    md("md", RtfCommandType.Destination),

    mdefJc("mdefJc", RtfCommandType.Value),

    mdeg("mdeg", RtfCommandType.Destination),

    mdegHide("mdegHide", RtfCommandType.Destination),

    mden("mden", RtfCommandType.Destination),

    mdiff("mdiff", RtfCommandType.Destination),

    mdiffSty("mdiffSty", RtfCommandType.Value),

    mdispDef("mdispDef", RtfCommandType.Value), // case is incorrect in the spec

    mdPr("mdPr", RtfCommandType.Destination),

    me("me", RtfCommandType.Destination),

    mendChr("mendChr", RtfCommandType.Destination),

    meqArr("meqArr", RtfCommandType.Destination),

    meqArrPr("meqArrPr", RtfCommandType.Destination),

    mf("mf", RtfCommandType.Destination),

    mfName("mfName", RtfCommandType.Destination),

    mfPr("mfPr", RtfCommandType.Destination),

    mfunc("mfunc", RtfCommandType.Destination),

    mfuncPr("mfuncPr", RtfCommandType.Destination),

    mgroupChr("mgroupChr", RtfCommandType.Destination),

    mgroupChrPr("mgroupChrPr", RtfCommandType.Destination),

    mgrow("mgrow", RtfCommandType.Destination),

    mhideBot("mhideBot", RtfCommandType.Destination),

    mhideLeft("mhideLeft", RtfCommandType.Destination),

    mhideRight("mhideRight", RtfCommandType.Destination),

    mhideTop("mhideTop", RtfCommandType.Destination),

    mhtmltag("mhtmltag", RtfCommandType.Destination),

    min("min", RtfCommandType.Value),

    minterSp("minterSp", RtfCommandType.Value),

    mintLim("mintLim", RtfCommandType.Value),

    mintraSp("mintraSp", RtfCommandType.Value),

    mjc("mjc", RtfCommandType.Value),

    mlim("mlim", RtfCommandType.Destination),

    mlimloc("mlimloc", RtfCommandType.Destination),

    mlimlow("mlimlow", RtfCommandType.Destination),

    mlimlowPr("mlimlowPr", RtfCommandType.Destination),

    mlimupp("mlimupp", RtfCommandType.Destination),

    mlimuppPr("mlimuppPr", RtfCommandType.Destination),

    mlit("mlit", RtfCommandType.Flag),

    mlMargin("mlMargin", RtfCommandType.Value),

    mm("mm", RtfCommandType.Destination),

    mmaddfieldname("mmaddfieldname", RtfCommandType.Destination),

    mmath("mmath", RtfCommandType.Destination),

    mmathFont("mmathFont", RtfCommandType.Value),

    mmathPict("mmathPict", RtfCommandType.Destination),

    mmathPr("mmathPr", RtfCommandType.Destination),

    mmattach("mmattach", RtfCommandType.Flag),

    mmaxdist("mmaxdist", RtfCommandType.Destination),

    mmblanklines("mmblanklines", RtfCommandType.Flag),

    mmc("mmc", RtfCommandType.Destination),

    mmcJc("mmcJc", RtfCommandType.Destination),

    mmconnectstr("mmconnectstr", RtfCommandType.Destination),

    mmconnectstrdata("mmconnectstrdata", RtfCommandType.Destination),

    mmcPr("mmcPr", RtfCommandType.Destination),

    mmcs("mmcs", RtfCommandType.Destination),

    mmdatasource("mmdatasource", RtfCommandType.Destination),

    mmdatatypeaccess("mmdatatypeaccess", RtfCommandType.Flag),

    mmdatatypeexcel("mmdatatypeexcel", RtfCommandType.Flag),

    mmdatatypefile("mmdatatypefile", RtfCommandType.Flag),

    mmdatatypeodbc("mmdatatypeodbc", RtfCommandType.Flag),

    mmdatatypeodso("mmdatatypeodso", RtfCommandType.Flag),

    mmdatatypeqt("mmdatatypeqt", RtfCommandType.Flag),

    mmdefaultsql("mmdefaultsql", RtfCommandType.Flag),

    mmdestemail("mmdestemail", RtfCommandType.Flag),

    mmdestfax("mmdestfax", RtfCommandType.Flag),

    mmdestnewdoc("mmdestnewdoc", RtfCommandType.Flag),

    mmdestprinter("mmdestprinter", RtfCommandType.Flag),

    mmerrors("mmerrors", RtfCommandType.Value),

    mmfttypeaddress("mmfttypeaddress", RtfCommandType.Flag),

    mmfttypebarcode("mmfttypebarcode", RtfCommandType.Flag),

    mmfttypedbcolumn("mmfttypedbcolumn", RtfCommandType.Flag),

    mmfttypemapped("mmfttypemapped", RtfCommandType.Flag),

    mmfttypenull("mmfttypenull", RtfCommandType.Flag),

    mmfttypesalutation("mmfttypesalutation", RtfCommandType.Flag),

    mmheadersource("mmheadersource", RtfCommandType.Destination),

    mmjdsotype("mmjdsotype", RtfCommandType.Value),

    mmlinktoquery("mmlinktoquery", RtfCommandType.Flag),

    mmmailsubject("mmmailsubject", RtfCommandType.Destination),

    mmmaintypecatalog("mmmaintypecatalog", RtfCommandType.Flag),

    mmmaintypeemail("mmmaintypeemail", RtfCommandType.Flag),

    mmmaintypeenvelopes("mmmaintypeenvelopes", RtfCommandType.Flag),

    mmmaintypefax("mmmaintypefax", RtfCommandType.Flag),

    mmmaintypelabels("mmmaintypelabels", RtfCommandType.Flag),

    mmmaintypeletters("mmmaintypeletters", RtfCommandType.Flag),

    mmodso("mmodso", RtfCommandType.Destination),

    mmodsoactive("mmodsoactive", RtfCommandType.Value),

    mmodsocoldelim("mmodsocoldelim", RtfCommandType.Value),

    mmodsocolumn("mmodsocolumn", RtfCommandType.Value),

    mmodsodynaddr("mmodsodynaddr", RtfCommandType.Value),

    mmodsofhdr("mmodsofhdr", RtfCommandType.Value),

    mmodsofilter("mmodsofilter", RtfCommandType.Destination),

    mmodsofldmpdata("mmodsofldmpdata", RtfCommandType.Destination),

    mmodsofmcolumn("mmodsofmcolumn", RtfCommandType.Value),

    mmodsohash("mmodsohash", RtfCommandType.Value),

    mmodsolid("mmodsolid", RtfCommandType.Value),

    mmodsomappedname("mmodsomappedname", RtfCommandType.Destination),

    mmodsoname("mmodsoname", RtfCommandType.Destination),

    mmodsorecipdata("mmodsorecipdata", RtfCommandType.Destination),

    mmodsosort("mmodsosort", RtfCommandType.Destination),

    mmodsosrc("mmodsosrc", RtfCommandType.Destination),

    mmodsotable("mmodsotable", RtfCommandType.Destination),

    mmodsoudl("mmodsoudl", RtfCommandType.Destination),

    mmodsoudldata("mmodsoudldata", RtfCommandType.Destination),

    mmodsouniquetag("mmodsouniquetag", RtfCommandType.Destination),

    mmPr("mmPr", RtfCommandType.Destination),

    mmquery("mmquery", RtfCommandType.Destination),

    mmr("mmr", RtfCommandType.Destination),

    mmreccur("mmreccur", RtfCommandType.Value),

    mmshowdata("mmshowdata", RtfCommandType.Flag),

    mnary("mnary", RtfCommandType.Destination),

    mnaryLim("mnaryLim", RtfCommandType.Value),

    mnaryPr("mnaryPr", RtfCommandType.Destination),

    mnoBreak("mnoBreak", RtfCommandType.Destination),

    mnor("mnor", RtfCommandType.Flag),

    mnum("mnum", RtfCommandType.Destination),

    mo("mo", RtfCommandType.Value),

    mobjDist("mobjDist", RtfCommandType.Destination),

    moMath("moMath", RtfCommandType.Destination),

    moMathPara("moMathPara", RtfCommandType.Destination),

    moMathParaPr("moMathParaPr", RtfCommandType.Destination),

    mopEmu("mopEmu", RtfCommandType.Destination),

    mphant("mphant", RtfCommandType.Destination),

    mphantPr("mphantPr", RtfCommandType.Destination),

    mplcHide("mplcHide", RtfCommandType.Destination),

    mpos("mpos", RtfCommandType.Destination),

    mpostSp("mpostSp", RtfCommandType.Value),

    mpreSp("mpreSp", RtfCommandType.Value),

    mr("mr", RtfCommandType.Destination),

    mrad("mrad", RtfCommandType.Destination),

    mradPr("mradPr", RtfCommandType.Destination),

    mrMargin("mrMargin", RtfCommandType.Value),

    mrPr("mrPr", RtfCommandType.Destination),

    mrSp("mrSp", RtfCommandType.Value),

    mrSpRule("mrSpRule", RtfCommandType.Value),

    mscr("mscr", RtfCommandType.Value),

    msepChr("msepChr", RtfCommandType.Destination),

    mshow("mshow", RtfCommandType.Destination),

    mshp("mshp", RtfCommandType.Destination),

    msmallFrac("msmallFrac", RtfCommandType.Value),

    msmcap("msmcap", RtfCommandType.Flag),

    msPre("msPre", RtfCommandType.Destination),

    msPrePr("msPrePr", RtfCommandType.Destination),

    msSub("msSub", RtfCommandType.Destination),

    msSubPr("msSubPr", RtfCommandType.Destination),

    msSubSup("msSubSup", RtfCommandType.Destination),

    msSubSupPr("msSubSupPr", RtfCommandType.Destination),

    msSup("msSup", RtfCommandType.Destination),

    msSupPr("msSupPr", RtfCommandType.Destination),

    mstrikeBLTR("mstrikeBLTR", RtfCommandType.Destination),

    mstrikeH("mstrikeH", RtfCommandType.Destination),

    mstrikeTLBR("mstrikeTLBR", RtfCommandType.Destination),

    mstrikeV("mstrikeV", RtfCommandType.Destination),

    msty("msty", RtfCommandType.Value),

    msub("msub", RtfCommandType.Destination),

    msubHide("msubHide", RtfCommandType.Destination),

    msup("msup", RtfCommandType.Destination),

    msupHide("msupHide", RtfCommandType.Destination),

    mtransp("mtransp", RtfCommandType.Destination),

    mtype("mtype", RtfCommandType.Destination),

    muser("muser", RtfCommandType.Flag),

    mvauthN("mvauth", RtfCommandType.Value),

    mvdateN("mvdate", RtfCommandType.Value),

    mvertJc("mvertJc", RtfCommandType.Destination),

    mvf("mvf", RtfCommandType.Flag),

    mvfmf("mvfmf", RtfCommandType.Destination),

    mvfml("mvfml", RtfCommandType.Destination),

    mvt("mvt", RtfCommandType.Flag),

    mvtof("mvtof", RtfCommandType.Destination),

    mvtol("mvtol", RtfCommandType.Destination),

    mwrapIndent("mwrapIndent", RtfCommandType.Value),

    mwrapRight("mwrapRight", RtfCommandType.Value),

    mzeroAsc("mzeroAsc", RtfCommandType.Destination),

    mzeroDesc("mzeroDesc", RtfCommandType.Destination),

    mzeroWid("mzeroWid", RtfCommandType.Destination),

    nestcell("nestcell", RtfCommandType.Symbol),

    nestrow("nestrow", RtfCommandType.Symbol),

    nesttableprops("nesttableprops", RtfCommandType.Destination),

    newtblstyruls("newtblstyruls", RtfCommandType.Flag),

    nextfile("nextfile", RtfCommandType.Destination),

    noafcnsttbl("noafcnsttbl", RtfCommandType.Flag),

    nobrkwrptbl("nobrkwrptbl", RtfCommandType.Flag),

    nocolbal("nocolbal", RtfCommandType.Flag),

    nocompatoptions("nocompatoptions", RtfCommandType.Flag),

    nocwrap("nocwrap", RtfCommandType.Flag),

    nocxsptable("nocxsptable", RtfCommandType.Flag),

    noextrasprl("noextrasprl", RtfCommandType.Flag),

    nofchars("nofchars", RtfCommandType.Value),

    nofcharsws("nofcharsws", RtfCommandType.Value),

    nofeaturethrottle("nofeaturethrottle", RtfCommandType.Flag),

    nofpages("nofpages", RtfCommandType.Value),

    nofwords("nofwords", RtfCommandType.Value),

    nogrowautofit("nogrowautofit", RtfCommandType.Flag),

    noindnmbrts("noindnmbrts", RtfCommandType.Flag),

    nojkernpunct("nojkernpunct", RtfCommandType.Flag),

    nolead("nolead", RtfCommandType.Flag),

    noline("noline", RtfCommandType.Flag),

    nolnhtadjtbl("nolnhtadjtbl", RtfCommandType.Flag),

    nonesttables("nonesttables", RtfCommandType.Destination),

    nonshppict("nonshppict", RtfCommandType.Flag),

    nooverflow("nooverflow", RtfCommandType.Flag),

    noproof("noproof", RtfCommandType.Flag),

    noqfpromote("noqfpromote", RtfCommandType.Flag),

    nosectexpand("nosectexpand", RtfCommandType.Flag),

    nosnaplinegrid("nosnaplinegrid", RtfCommandType.Flag),

    nospaceforul("nospaceforul", RtfCommandType.Flag),

    nosupersub("nosupersub", RtfCommandType.Flag),

    notabind("notabind", RtfCommandType.Flag),

    notbrkcnstfrctbl("notbrkcnstfrctbl", RtfCommandType.Flag),

    notcvasp("notcvasp", RtfCommandType.Flag),

    notvatxbx("notvatxbx", RtfCommandType.Flag),

    nouicompat("nouicompat", RtfCommandType.Flag),

    noultrlspc("noultrlspc", RtfCommandType.Flag),

    nowidctlpar("nowidctlpar", RtfCommandType.Flag),

    nowrap("nowrap", RtfCommandType.Flag),

    nowwrap("nowwrap", RtfCommandType.Flag),

    noxlattoyen("noxlattoyen", RtfCommandType.Flag),

    objalias("objalias", RtfCommandType.Destination),

    objalign("objalign", RtfCommandType.Value),

    objattph("objattph", RtfCommandType.Flag),

    objautlink("objautlink", RtfCommandType.Flag),

    objclass("objclass", RtfCommandType.Destination),

    objcropb("objcropb", RtfCommandType.Value),

    objcropl("objcropl", RtfCommandType.Value),

    objcropr("objcropr", RtfCommandType.Value),

    objcropt("objcropt", RtfCommandType.Value),

    objdata("objdata", RtfCommandType.Destination),

    object("object", RtfCommandType.Destination),

    objemb("objemb", RtfCommandType.Flag),

    objh("objh", RtfCommandType.Value),

    objhtml("objhtml", RtfCommandType.Flag),

    objicemb("objicemb", RtfCommandType.Flag),

    objlink("objlink", RtfCommandType.Flag),

    objlock("objlock", RtfCommandType.Flag),

    objname("objname", RtfCommandType.Destination),

    objocx("objocx", RtfCommandType.Flag),

    objpub("objpub", RtfCommandType.Flag),

    objscalex("objscalex", RtfCommandType.Value),

    objscaley("objscaley", RtfCommandType.Value),

    objsect("objsect", RtfCommandType.Destination),

    objsetsize("objsetsize", RtfCommandType.Flag),

    objsub("objsub", RtfCommandType.Flag),

    objtime("objtime", RtfCommandType.Destination),

    objtransy("objtransy", RtfCommandType.Value),

    objupdate("objupdate", RtfCommandType.Flag),

    objw("objw", RtfCommandType.Value),

    ogutter("ogutter", RtfCommandType.Value),

    oldas("oldas", RtfCommandType.Flag),

    oldcprops("oldcprops", RtfCommandType.Destination),

    oldlinewrap("oldlinewrap", RtfCommandType.Flag),

    oldpprops("oldpprops", RtfCommandType.Destination),

    oldsprops("oldsprops", RtfCommandType.Destination),

    oldtprops("oldtprops", RtfCommandType.Destination),

    oleclsid("oleclsid", RtfCommandType.Destination),

    operator("operator", RtfCommandType.Destination),

    otblrul("otblrul", RtfCommandType.Flag),

    outl("outl", RtfCommandType.Toggle),

    outlinelevelN("outlinelevel", RtfCommandType.Value),

    overlay("overlay", RtfCommandType.Flag),

    page("page", RtfCommandType.Symbol),

    pagebb("pagebb", RtfCommandType.Flag),

    panose("panose", RtfCommandType.Destination),

    paperh("paperh", RtfCommandType.Value),

    paperw("paperw", RtfCommandType.Value),

    par("par", RtfCommandType.Symbol),

    pararsid("pararsid", RtfCommandType.Value),

    pard("pard", RtfCommandType.Flag),

    password("password", RtfCommandType.Destination),

    passwordhash("passwordhash", RtfCommandType.Destination),

    pc("pc", RtfCommandType.Encoding),

    pca("pca", RtfCommandType.Encoding),

    pgbrdrb("pgbrdrb", RtfCommandType.Flag),

    pgbrdrfoot("pgbrdrfoot", RtfCommandType.Flag),

    pgbrdrhead("pgbrdrhead", RtfCommandType.Flag),

    pgbrdrl("pgbrdrl", RtfCommandType.Flag),

    pgbrdropt("pgbrdropt", RtfCommandType.Value),

    pgbrdrr("pgbrdrr", RtfCommandType.Flag),

    pgbrdrsnap("pgbrdrsnap", RtfCommandType.Flag),

    pgbrdrt("pgbrdrt", RtfCommandType.Flag),

    pghsxn("pghsxn", RtfCommandType.Value),

    pgnbidia("pgnbidia", RtfCommandType.Flag),

    pgnbidib("pgnbidib", RtfCommandType.Flag),

    pgnchosung("pgnchosung", RtfCommandType.Flag),

    pgncnum("pgncnum", RtfCommandType.Flag),

    pgncont("pgncont", RtfCommandType.Flag),

    pgndbnum("pgndbnum", RtfCommandType.Flag),

    pgndbnumd("pgndbnumd", RtfCommandType.Flag),

    pgndbnumk("pgndbnumk", RtfCommandType.Flag),

    pgndbnumt("pgndbnumt", RtfCommandType.Flag),

    pgndec("pgndec", RtfCommandType.Flag),

    pgndecd("pgndecd", RtfCommandType.Flag),

    pgnganada("pgnganada", RtfCommandType.Flag),

    pgngbnum("pgngbnum", RtfCommandType.Flag),

    pgngbnumd("pgngbnumd", RtfCommandType.Flag),

    pgngbnumk("pgngbnumk", RtfCommandType.Flag),

    pgngbnuml("pgngbnuml", RtfCommandType.Flag),

    pgnhindia("pgnhindia", RtfCommandType.Flag),

    pgnhindib("pgnhindib", RtfCommandType.Flag),

    pgnhindic("pgnhindic", RtfCommandType.Flag),

    pgnhindid("pgnhindid", RtfCommandType.Flag),

    pgnhnN("pgnhn", RtfCommandType.Value),

    pgnhnsc("pgnhnsc", RtfCommandType.Flag),

    pgnhnsh("pgnhnsh", RtfCommandType.Flag),

    pgnhnsm("pgnhnsm", RtfCommandType.Flag),

    pgnhnsn("pgnhnsn", RtfCommandType.Flag),

    pgnhnsp("pgnhnsp", RtfCommandType.Flag),

    pgnid("pgnid", RtfCommandType.Flag),

    pgnlcltr("pgnlcltr", RtfCommandType.Flag),

    pgnlcrm("pgnlcrm", RtfCommandType.Flag),

    pgnrestart("pgnrestart", RtfCommandType.Flag),

    pgnstart("pgnstart", RtfCommandType.Value),

    pgnstarts("pgnstarts", RtfCommandType.Value),

    pgnthaia("pgnthaia", RtfCommandType.Flag),

    pgnthaib("pgnthaib", RtfCommandType.Flag),

    pgnthaic("pgnthaic", RtfCommandType.Flag),

    pgnucltr("pgnucltr", RtfCommandType.Flag),

    pgnucrm("pgnucrm", RtfCommandType.Flag),

    pgnvieta("pgnvieta", RtfCommandType.Flag),

    pgnx("pgnx", RtfCommandType.Value),

    pgny("pgny", RtfCommandType.Value),

    pgnzodiac("pgnzodiac", RtfCommandType.Flag),

    pgnzodiacd("pgnzodiacd", RtfCommandType.Flag),

    pgnzodiacl("pgnzodiacl", RtfCommandType.Flag),

    pgp("pgp", RtfCommandType.Destination),

    pgptbl("pgptbl", RtfCommandType.Destination),

    pgwsxn("pgwsxn", RtfCommandType.Value),

    phcol("phcol", RtfCommandType.Flag),

    phmrg("phmrg", RtfCommandType.Flag),

    phpg("phpg", RtfCommandType.Flag),

    picbmp("picbmp", RtfCommandType.Flag),

    picbppN("picbpp", RtfCommandType.Value),

    piccropb("piccropb", RtfCommandType.Value),

    piccropl("piccropl", RtfCommandType.Value),

    piccropr("piccropr", RtfCommandType.Value),

    piccropt("piccropt", RtfCommandType.Value),

    pich("pich", RtfCommandType.Value),

    pichgoal("pichgoal", RtfCommandType.Value),

    picprop("picprop", RtfCommandType.Destination),

    picscaled("picscaled", RtfCommandType.Flag),

    picscalex("picscalex", RtfCommandType.Value),

    picscaley("picscaley", RtfCommandType.Value),

    pict("pict", RtfCommandType.Destination),

    picw("picw", RtfCommandType.Value),

    picwgoal("picwgoal", RtfCommandType.Value),

    pindtabqc("pindtabqc", RtfCommandType.Flag),

    pindtabql("pindtabql", RtfCommandType.Flag),

    pindtabqr("pindtabqr", RtfCommandType.Flag),

    plain("plain", RtfCommandType.Flag),

    pmartabqc("pmartabqc", RtfCommandType.Flag),

    pmartabql("pmartabql", RtfCommandType.Flag),

    pmartabqr("pmartabqr", RtfCommandType.Flag),

    pmmetafile("pmmetafile", RtfCommandType.Value),

    pn("pn", RtfCommandType.Destination),

    pnacross("pnacross", RtfCommandType.Flag),

    pnaiu("pnaiu", RtfCommandType.Flag),

    pnaiud("pnaiud", RtfCommandType.Flag),

    pnaiueo("pnaiueo", RtfCommandType.Flag),

    pnaiueod("pnaiueod", RtfCommandType.Flag),

    pnb("pnb", RtfCommandType.Toggle),

    pnbidia("pnbidia", RtfCommandType.Flag),

    pnbidib("pnbidib", RtfCommandType.Flag),

    pncaps("pncaps", RtfCommandType.Toggle),

    pncard("pncard", RtfCommandType.Flag),

    pncfN("pncf", RtfCommandType.Value),

    pnchosung("pnchosung", RtfCommandType.Flag),

    pncnum("pncnum", RtfCommandType.Flag),

    pndbnum("pndbnum", RtfCommandType.Flag),

    pndbnumd("pndbnumd", RtfCommandType.Flag),

    pndbnumk("pndbnumk", RtfCommandType.Flag),

    pndbnuml("pndbnuml", RtfCommandType.Flag),

    pndbnumt("pndbnumt", RtfCommandType.Flag),

    pndec("pndec", RtfCommandType.Flag),

    pndecd("pndecd", RtfCommandType.Flag),

    pnfN("pnf", RtfCommandType.Value),

    pnfsN("pnfs", RtfCommandType.Value),

    pnganada("pnganada", RtfCommandType.Flag),

    pngblip("pngblip", RtfCommandType.Flag),

    pngbnum("pngbnum", RtfCommandType.Flag),

    pngbnumd("pngbnumd", RtfCommandType.Flag),

    pngbnumk("pngbnumk", RtfCommandType.Flag),

    pngbnuml("pngbnuml", RtfCommandType.Flag),

    pnhang("pnhang", RtfCommandType.Flag),

    pni("pni", RtfCommandType.Toggle),

    pnindentN("pnindent", RtfCommandType.Value),

    pniroha("pniroha", RtfCommandType.Flag),

    pnirohad("pnirohad", RtfCommandType.Flag),

    pnlcltr("pnlcltr", RtfCommandType.Flag),

    pnlcrm("pnlcrm", RtfCommandType.Flag),

    pnlvlN("pnlvl", RtfCommandType.Value),

    pnlvlblt("pnlvlblt", RtfCommandType.Flag),

    pnlvlbody("pnlvlbody", RtfCommandType.Flag),

    pnlvlcont("pnlvlcont", RtfCommandType.Flag),

    pnnumonce("pnnumonce", RtfCommandType.Flag),

    pnord("pnord", RtfCommandType.Flag),

    pnordt("pnordt", RtfCommandType.Flag),

    pnprev("pnprev", RtfCommandType.Flag),

    pnqc("pnqc", RtfCommandType.Flag),

    pnql("pnql", RtfCommandType.Flag),

    pnqr("pnqr", RtfCommandType.Flag),

    pnrauth("pnrauth", RtfCommandType.Value),

    pnrdate("pnrdate", RtfCommandType.Value),

    pnrestart("pnrestart", RtfCommandType.Flag),

    pnrnfc("pnrnfc", RtfCommandType.Value),

    pnrnot("pnrnot", RtfCommandType.Flag),

    pnrpnbr("pnrpnbr", RtfCommandType.Value),

    pnrrgb("pnrrgb", RtfCommandType.Value),

    pnrstart("pnrstart", RtfCommandType.Value),

    pnrstop("pnrstop", RtfCommandType.Value),

    pnrxst("pnrxst", RtfCommandType.Value),

    pnscaps("pnscaps", RtfCommandType.Toggle),

    pnseclvl("pnseclvl", RtfCommandType.Destination), // and Value

    pnspN("pnsp", RtfCommandType.Value),

    pnstartN("pnstart", RtfCommandType.Value),

    pnstrike("pnstrike", RtfCommandType.Toggle),

    pntext("pntext", RtfCommandType.Destination),

    pntxta("pntxta", RtfCommandType.Destination),

    pntxtb("pntxtb", RtfCommandType.Destination),

    pnucltr("pnucltr", RtfCommandType.Flag),

    pnucrm("pnucrm", RtfCommandType.Flag),

    pnul("pnul", RtfCommandType.Toggle),

    pnuld("pnuld", RtfCommandType.Flag),

    pnuldash("pnuldash", RtfCommandType.Flag),

    pnuldashd("pnuldashd", RtfCommandType.Flag),

    pnuldashdd("pnuldashdd", RtfCommandType.Flag),

    pnuldb("pnuldb", RtfCommandType.Flag),

    pnulhair("pnulhair", RtfCommandType.Flag),

    pnulnone("pnulnone", RtfCommandType.Flag),

    pnulth("pnulth", RtfCommandType.Flag),

    pnulw("pnulw", RtfCommandType.Flag),

    pnulwave("pnulwave", RtfCommandType.Flag),

    pnzodiac("pnzodiac", RtfCommandType.Flag),

    pnzodiacd("pnzodiacd", RtfCommandType.Flag),

    pnzodiacl("pnzodiacl", RtfCommandType.Flag),

    posnegxN("posnegx", RtfCommandType.Value),

    posnegyN("posnegy", RtfCommandType.Value),

    posx("posx", RtfCommandType.Value),

    posxc("posxc", RtfCommandType.Flag),

    posxi("posxi", RtfCommandType.Flag),

    posxl("posxl", RtfCommandType.Flag),

    posxo("posxo", RtfCommandType.Flag),

    posxr("posxr", RtfCommandType.Flag),

    posy("posy", RtfCommandType.Value),

    posyb("posyb", RtfCommandType.Flag),

    posyc("posyc", RtfCommandType.Flag),

    posyil("posyil", RtfCommandType.Flag),

    posyin("posyin", RtfCommandType.Flag),

    posyout("posyout", RtfCommandType.Flag),

    posyt("posyt", RtfCommandType.Flag),

    prauth("prauth", RtfCommandType.Value),

    prcolbl("prcolbl", RtfCommandType.Flag),

    prdate("prdate", RtfCommandType.Value),

    printdata("printdata", RtfCommandType.Flag),

    printim("printim", RtfCommandType.Destination),

    privatecmd("private", RtfCommandType.Destination),

    propname("propname", RtfCommandType.Destination),

    proptype("proptype", RtfCommandType.Value),

    protect("protect", RtfCommandType.Toggle),

    protend("protend", RtfCommandType.Destination),

    protlevel("protlevel", RtfCommandType.Value),

    protstart("protstart", RtfCommandType.Destination),

    protusertbl("protusertbl", RtfCommandType.Destination),

    psover("psover", RtfCommandType.Flag),

    pszN("psz", RtfCommandType.Value),

    ptabldot("ptabldot", RtfCommandType.Flag),

    ptablmdot("ptablmdot", RtfCommandType.Flag),

    ptablminus("ptablminus", RtfCommandType.Flag),

    ptablnone("ptablnone", RtfCommandType.Flag),

    ptabluscore("ptabluscore", RtfCommandType.Flag),

    pubauto("pubauto", RtfCommandType.Flag),

    pvmrg("pvmrg", RtfCommandType.Flag),

    pvpara("pvpara", RtfCommandType.Flag),

    pvpg("pvpg", RtfCommandType.Flag),

    pwd("pwd", RtfCommandType.Value),

    pxe("pxe", RtfCommandType.Destination),

    qc("qc", RtfCommandType.Flag),

    qd("qd", RtfCommandType.Flag),

    qj("qj", RtfCommandType.Flag),

    qk("qk", RtfCommandType.Value),

    ql("ql", RtfCommandType.Flag),

    qmspace("qmspace", RtfCommandType.Symbol),

    qr("qr", RtfCommandType.Flag),

    qt("qt", RtfCommandType.Flag),

    rawclbgdkbdiag("rawclbgdkbdiag", RtfCommandType.Flag),

    rawclbgbdiag("rawclbgbdiag", RtfCommandType.Flag),

    rawclbgcross("rawclbgcross", RtfCommandType.Flag),

    rawclbgdcross("rawclbgdcross", RtfCommandType.Flag),

    rawclbgdkcross("rawclbgdkcross", RtfCommandType.Flag),

    rawclbgdkdcross("rawclbgdkdcross", RtfCommandType.Flag),

    rawclbgdkfdiag("rawclbgdkfdiag", RtfCommandType.Flag),

    rawclbgdkhor("rawclbgdkhor", RtfCommandType.Flag),

    rawclbgdkvert("rawclbgdkvert", RtfCommandType.Flag),

    rawclbgfdiag("rawclbgfdiag", RtfCommandType.Flag),

    rawclbghoriz("rawclbghoriz", RtfCommandType.Flag),

    rawclbgvert("rawclbgvert", RtfCommandType.Flag),

    rdblquote("rdblquote", RtfCommandType.Symbol),

    readonlyrecommended("readonlyrecommended", RtfCommandType.Flag),

    readprot("readprot", RtfCommandType.Flag),

    red("red", RtfCommandType.Value),

    relyonvml("relyonvml", RtfCommandType.Value),

    remdttm("remdttm", RtfCommandType.Flag),

    rempersonalinfo("rempersonalinfo", RtfCommandType.Flag),

    result("result", RtfCommandType.Destination),

    revauthN("revauth", RtfCommandType.Value),

    revauthdel("revauthdel", RtfCommandType.Value),

    revbar("revbar", RtfCommandType.Value),

    revdttmN("revdttm", RtfCommandType.Value),

    revdttmdel("revdttmdel", RtfCommandType.Value),

    revised("revised", RtfCommandType.Toggle),

    revisions("revisions", RtfCommandType.Flag),

    revprop("revprop", RtfCommandType.Value),

    revprot("revprot", RtfCommandType.Flag),

    revtbl("revtbl", RtfCommandType.Destination),

    revtim("revtim", RtfCommandType.Destination),

    ri("ri", RtfCommandType.Value),

    rin("rin", RtfCommandType.Value),

    row("row", RtfCommandType.Symbol),

    rquote("rquote", RtfCommandType.Symbol),

    rsid("rsid", RtfCommandType.Value),

    rsidroot("rsidroot", RtfCommandType.Value),

    rsidtbl("rsidtbl", RtfCommandType.Destination),

    rsltbmp("rsltbmp", RtfCommandType.Flag),

    rslthtml("rslthtml", RtfCommandType.Flag),

    rsltmerge("rsltmerge", RtfCommandType.Flag),

    rsltpict("rsltpict", RtfCommandType.Flag),

    rsltrtf("rsltrtf", RtfCommandType.Flag),

    rslttxt("rslttxt", RtfCommandType.Flag),

    rtf("rtf", RtfCommandType.Destination),

    rtlch("rtlch", RtfCommandType.Flag),

    rtldoc("rtldoc", RtfCommandType.Flag),

    rtlgutter("rtlgutter", RtfCommandType.Flag),

    rtlmark("rtlmark", RtfCommandType.Symbol),

    rtlpar("rtlpar", RtfCommandType.Flag),

    rtlrow("rtlrow", RtfCommandType.Flag),

    rtlsect("rtlsect", RtfCommandType.Flag),

    rxe("rxe", RtfCommandType.Destination),

    s("s", RtfCommandType.Value),

    sa("sa", RtfCommandType.Value),

    saauto("saauto", RtfCommandType.Toggle),

    saftnnalc("saftnnalc", RtfCommandType.Flag),

    saftnnar("saftnnar", RtfCommandType.Flag),

    saftnnauc("saftnnauc", RtfCommandType.Flag),

    saftnnchi("saftnnchi", RtfCommandType.Flag),

    saftnnchosung("saftnnchosung", RtfCommandType.Flag),

    saftnncnum("saftnncnum", RtfCommandType.Flag),

    saftnndbar("saftnndbar", RtfCommandType.Flag),

    saftnndbnum("saftnndbnum", RtfCommandType.Flag),

    saftnndbnumd("saftnndbnumd", RtfCommandType.Flag),

    saftnndbnumk("saftnndbnumk", RtfCommandType.Flag),

    saftnndbnumt("saftnndbnumt", RtfCommandType.Flag),

    saftnnganada("saftnnganada", RtfCommandType.Flag),

    saftnngbnum("saftnngbnum", RtfCommandType.Flag),

    saftnngbnumd("saftnngbnumd", RtfCommandType.Flag),

    saftnngbnumk("saftnngbnumk", RtfCommandType.Flag),

    saftnngbnuml("saftnngbnuml", RtfCommandType.Flag),

    saftnnrlc("saftnnrlc", RtfCommandType.Flag),

    saftnnruc("saftnnruc", RtfCommandType.Flag),

    saftnnzodiac("saftnnzodiac", RtfCommandType.Flag),

    saftnnzodiacd("saftnnzodiacd", RtfCommandType.Flag),

    saftnnzodiacl("saftnnzodiacl", RtfCommandType.Flag),

    saftnrestart("saftnrestart", RtfCommandType.Flag),

    saftnrstcont("saftnrstcont", RtfCommandType.Flag),

    saftnstart("saftnstart", RtfCommandType.Value),

    sautoupd("sautoupd", RtfCommandType.Flag),

    saveinvalidxml("saveinvalidxml", RtfCommandType.Flag),

    saveprevpict("saveprevpict", RtfCommandType.Flag),

    sb("sb", RtfCommandType.Value),

    sbasedon("sbasedon", RtfCommandType.Value),

    sbauto("sbauto", RtfCommandType.Toggle),

    sbkcol("sbkcol", RtfCommandType.Flag),

    sbkeven("sbkeven", RtfCommandType.Flag),

    sbknone("sbknone", RtfCommandType.Flag),

    sbkodd("sbkodd", RtfCommandType.Flag),

    sbkpage("sbkpage", RtfCommandType.Flag),

    sbys("sbys", RtfCommandType.Flag),

    scaps("scaps", RtfCommandType.Toggle),

    scompose("scompose", RtfCommandType.Flag),

    sec("sec", RtfCommandType.Value),

    sect("sect", RtfCommandType.Symbol),

    sectd("sectd", RtfCommandType.Flag),

    sectdefaultcl("sectdefaultcl", RtfCommandType.Flag),

    sectexpand("sectexpand", RtfCommandType.Value),

    sectlinegrid("sectlinegrid", RtfCommandType.Value),

    sectnum("sectnum", RtfCommandType.Symbol),

    sectrsid("sectrsid", RtfCommandType.Value),

    sectspecifycl("sectspecifycl", RtfCommandType.Flag),

    sectspecifygen("sectspecifygen", RtfCommandType.Flag),

    sectspecifyl("sectspecifyl", RtfCommandType.Flag),

    sectunlocked("sectunlocked", RtfCommandType.Flag),

    sftnbj("sftnbj", RtfCommandType.Flag),

    sftnnalc("sftnnalc", RtfCommandType.Flag),

    sftnnar("sftnnar", RtfCommandType.Flag),

    sftnnauc("sftnnauc", RtfCommandType.Flag),

    sftnnchi("sftnnchi", RtfCommandType.Flag),

    sftnnchosung("sftnnchosung", RtfCommandType.Flag),

    sftnncnum("sftnncnum", RtfCommandType.Flag),

    sftnndbar("sftnndbar", RtfCommandType.Flag),

    sftnndbnum("sftnndbnum", RtfCommandType.Flag),

    sftnndbnumd("sftnndbnumd", RtfCommandType.Flag),

    sftnndbnumk("sftnndbnumk", RtfCommandType.Flag),

    sftnndbnumt("sftnndbnumt", RtfCommandType.Flag),

    sftnnganada("sftnnganada", RtfCommandType.Flag),

    sftnngbnum("sftnngbnum", RtfCommandType.Flag),

    sftnngbnumd("sftnngbnumd", RtfCommandType.Flag),

    sftnngbnumk("sftnngbnumk", RtfCommandType.Flag),

    sftnngbnuml("sftnngbnuml", RtfCommandType.Flag),

    sftnnrlc("sftnnrlc", RtfCommandType.Flag),

    sftnnruc("sftnnruc", RtfCommandType.Flag),

    sftnnzodiac("sftnnzodiac", RtfCommandType.Flag),

    sftnnzodiacd("sftnnzodiacd", RtfCommandType.Flag),

    sftnnzodiacl("sftnnzodiacl", RtfCommandType.Flag),

    sftnrestart("sftnrestart", RtfCommandType.Flag),

    sftnrstcont("sftnrstcont", RtfCommandType.Flag),

    sftnrstpg("sftnrstpg", RtfCommandType.Flag),

    sftnstart("sftnstart", RtfCommandType.Value),

    sftntj("sftntj", RtfCommandType.Flag),

    shad("shad", RtfCommandType.Toggle),

    shading("shading", RtfCommandType.Value),

    shidden("shidden", RtfCommandType.Flag),

    shift("shift", RtfCommandType.Flag),

    showplaceholdtext("showplaceholdtext", RtfCommandType.Value),

    showxmlerrors("showxmlerrors", RtfCommandType.Value),

    shp("shp", RtfCommandType.Destination),

    shpbottom("shpbottom", RtfCommandType.Value),

    shpbxcolumn("shpbxcolumn", RtfCommandType.Flag),

    shpbxignore("shpbxignore", RtfCommandType.Flag),

    shpbxmargin("shpbxmargin", RtfCommandType.Flag),

    shpbxpage("shpbxpage", RtfCommandType.Flag),

    shpbyignore("shpbyignore", RtfCommandType.Flag),

    shpbymargin("shpbymargin", RtfCommandType.Flag),

    shpbypage("shpbypage", RtfCommandType.Flag),

    shpbypara("shpbypara", RtfCommandType.Flag),

    shpfblwtxt("shpfblwtxt", RtfCommandType.Value),

    shpfhdr("shpfhdr", RtfCommandType.Value),

    shpgrp("shpgrp", RtfCommandType.Destination),

    shpinst("shpinst", RtfCommandType.Destination),

    shpleft("shpleft", RtfCommandType.Value),

    shplid("shplid", RtfCommandType.Value),

    shplockanchor("shplockanchor", RtfCommandType.Flag),

    shppict("shppict", RtfCommandType.Destination),

    shpright("shpright", RtfCommandType.Value),

    shprslt("shprslt", RtfCommandType.Destination),

    shptop("shptop", RtfCommandType.Value),

    shptxt("shptxt", RtfCommandType.Destination),

    shpwrk("shpwrk", RtfCommandType.Value),

    shpwr("shpwr", RtfCommandType.Value),

    shpz("shpz", RtfCommandType.Value),

    sl("sl", RtfCommandType.Value),

    slink("slink", RtfCommandType.Value),

    slmult("slmult", RtfCommandType.Value),

    slocked("slocked", RtfCommandType.Flag),

    sn("sn", RtfCommandType.Destination),

    snaptogridincell("snaptogridincell", RtfCommandType.Flag),

    snext("snext", RtfCommandType.Value),

    softcol("softcol", RtfCommandType.Flag),

    softlheightN("softlheight", RtfCommandType.Value),

    softline("softline", RtfCommandType.Flag),

    softpage("softpage", RtfCommandType.Flag),

    sp("sp", RtfCommandType.Destination),

    spersonal("spersonal", RtfCommandType.Flag),

    spltpgpar("spltpgpar", RtfCommandType.Flag),

    splytwnine("splytwnine", RtfCommandType.Flag),

    spriority("spriority", RtfCommandType.Value),

    sprsbsp("sprsbsp", RtfCommandType.Flag),

    sprslnsp("sprslnsp", RtfCommandType.Flag),

    sprsspbf("sprsspbf", RtfCommandType.Flag),

    sprstsm("sprstsm", RtfCommandType.Flag),

    sprstsp("sprstsp", RtfCommandType.Flag),

    spv("spv", RtfCommandType.Flag),

    sqformat("sqformat", RtfCommandType.Flag),

    srauth("srauth", RtfCommandType.Value),

    srdate("srdate", RtfCommandType.Value),

    sreply("sreply", RtfCommandType.Flag),

    ssemihidden("ssemihidden", RtfCommandType.Value),

    staticval("staticval", RtfCommandType.Destination),

    stextflow("stextflow", RtfCommandType.Value),

    strike("strike", RtfCommandType.Toggle),

    striked("striked", RtfCommandType.Toggle),

    stshfbi("stshfbi", RtfCommandType.Value),

    stshfdbch("stshfdbch", RtfCommandType.Value),

    stshfhich("stshfhich", RtfCommandType.Value),

    stshfloch("stshfloch", RtfCommandType.Value),

    stylelock("stylelock", RtfCommandType.Flag),

    stylelockbackcomp("stylelockbackcomp", RtfCommandType.Flag),

    stylelockenforced("stylelockenforced", RtfCommandType.Flag),

    stylelockqfset("stylelockqfset", RtfCommandType.Flag),

    stylelocktheme("stylelocktheme", RtfCommandType.Flag),

    stylesheet("stylesheet", RtfCommandType.Destination),

    stylesortmethod("stylesortmethod", RtfCommandType.Value),

    styrsid("styrsid", RtfCommandType.Value),

    sub("sub", RtfCommandType.Flag),

    subdocumentN("subdocument", RtfCommandType.Value),

    subfontbysize("subfontbysize", RtfCommandType.Flag),

    subject("subject", RtfCommandType.Destination),

    sunhideused("sunhideused", RtfCommandType.Value),

    supercmd("super", RtfCommandType.Flag),

    sv("sv", RtfCommandType.Destination),

    svb("svb", RtfCommandType.Destination),

    swpbdr("swpbdr", RtfCommandType.Flag),

    tab("tab", RtfCommandType.Symbol),

    tabsnoovrlp("tabsnoovrlp", RtfCommandType.Flag),

    taprtl("taprtl", RtfCommandType.Flag),

    tb("tb", RtfCommandType.Value),

    tblind("tblind", RtfCommandType.Value),

    tblindtype("tblindtype", RtfCommandType.Value),

    tbllkbestfit("tbllkbestfit", RtfCommandType.Flag),

    tbllkborder("tbllkborder", RtfCommandType.Flag),

    tbllkcolor("tbllkcolor", RtfCommandType.Flag),

    tbllkfont("tbllkfont", RtfCommandType.Flag),

    tbllkhdrcols("tbllkhdrcols", RtfCommandType.Flag),

    tbllkhdrrows("tbllkhdrrows", RtfCommandType.Flag),

    tbllklastcol("tbllklastcol", RtfCommandType.Flag),

    tbllklastrow("tbllklastrow", RtfCommandType.Flag),

    tbllknocolband("tbllknocolband", RtfCommandType.Flag),

    tbllknorowband("tbllknorowband", RtfCommandType.Flag),

    tbllkshading("tbllkshading", RtfCommandType.Flag),

    tblrsid("tblrsid", RtfCommandType.Value),

    tc("tc", RtfCommandType.Destination),

    tcelld("tcelld", RtfCommandType.Flag),

    tcf("tcf", RtfCommandType.Value),

    tcl("tcl", RtfCommandType.Value),

    tcn("tcn", RtfCommandType.Flag),

    tdfrmtxtBottom("tdfrmtxtBottom", RtfCommandType.Value),

    tdfrmtxtLeft("tdfrmtxtLeft", RtfCommandType.Value),

    tdfrmtxtRight("tdfrmtxtRight", RtfCommandType.Value),

    tdfrmtxtTop("tdfrmtxtTop", RtfCommandType.Value),

    template("template", RtfCommandType.Destination),

    themedata("themedata", RtfCommandType.Destination),

    themelang("themelang", RtfCommandType.Value),

    themelangcs("themelangcs", RtfCommandType.Value),

    themelangfe("themelangfe", RtfCommandType.Value),

    time("time", RtfCommandType.Flag),

    title("title", RtfCommandType.Destination),

    titlepg("titlepg", RtfCommandType.Flag),

    tldot("tldot", RtfCommandType.Flag),

    tleq("tleq", RtfCommandType.Flag),

    tlhyph("tlhyph", RtfCommandType.Flag),

    tlmdot("tlmdot", RtfCommandType.Flag),

    tlth("tlth", RtfCommandType.Flag),

    tlul("tlul", RtfCommandType.Flag),

    toplinepunct("toplinepunct", RtfCommandType.Flag),

    tphcol("tphcol", RtfCommandType.Flag),

    tphmrg("tphmrg", RtfCommandType.Flag),

    tphpg("tphpg", RtfCommandType.Flag),

    tposnegx("tposnegx", RtfCommandType.Value),

    tposnegy("tposnegy", RtfCommandType.Value),

    tposxc("tposxc", RtfCommandType.Flag),

    tposxi("tposxi", RtfCommandType.Flag),

    tposxl("tposxl", RtfCommandType.Flag),

    tposx("tposx", RtfCommandType.Value),

    tposxo("tposxo", RtfCommandType.Flag),

    tposxr("tposxr", RtfCommandType.Flag),

    tposy("tposy", RtfCommandType.Value),

    tposyb("tposyb", RtfCommandType.Flag),

    tposyc("tposyc", RtfCommandType.Flag),

    tposyil("tposyil", RtfCommandType.Flag),

    tposyin("tposyin", RtfCommandType.Flag),

    tposyout("tposyout", RtfCommandType.Flag),

    tposyt("tposyt", RtfCommandType.Flag),

    tpvmrg("tpvmrg", RtfCommandType.Flag),

    tpvpara("tpvpara", RtfCommandType.Flag),

    tpvpg("tpvpg", RtfCommandType.Flag),

    tqc("tqc", RtfCommandType.Flag),

    tqdec("tqdec", RtfCommandType.Flag),

    tqr("tqr", RtfCommandType.Flag),

    trackformatting("trackformatting", RtfCommandType.Value),

    trackmoves("trackmoves", RtfCommandType.Value),

    transmf("transmf", RtfCommandType.Flag),

    trauth("trauth", RtfCommandType.Value),

    trautofit("trautofit", RtfCommandType.Toggle),

    trbgbdiag("trbgbdiag", RtfCommandType.Flag),

    trbgcross("trbgcross", RtfCommandType.Flag),

    trbgdcross("trbgdcross", RtfCommandType.Flag),

    trbgdkbdiag("trbgdkbdiag", RtfCommandType.Flag),

    trbgdkcross("trbgdkcross", RtfCommandType.Flag),

    trbgdkdcross("trbgdkdcross", RtfCommandType.Flag),

    trbgdkfdiag("trbgdkfdiag", RtfCommandType.Flag),

    trbgdkhor("trbgdkhor", RtfCommandType.Flag),

    trbgdkvert("trbgdkvert", RtfCommandType.Flag),

    trbgfdiag("trbgfdiag", RtfCommandType.Flag),

    trbghoriz("trbghoriz", RtfCommandType.Flag),

    trbgvert("trbgvert", RtfCommandType.Flag),

    trbrdrb("trbrdrb", RtfCommandType.Flag),

    trbrdrh("trbrdrh", RtfCommandType.Flag),

    trbrdrl("trbrdrl", RtfCommandType.Flag),

    trbrdrr("trbrdrr", RtfCommandType.Flag),

    trbrdrt("trbrdrt", RtfCommandType.Flag),

    trbrdrv("trbrdrv", RtfCommandType.Flag),

    trcbpat("trcbpat", RtfCommandType.Value),

    trcfpat("trcfpat", RtfCommandType.Value),

    trdate("trdate", RtfCommandType.Value),

    trftsWidthA("trftsWidthA", RtfCommandType.Value),

    trftsWidthB("trftsWidthB", RtfCommandType.Value),

    trftsWidth("trftsWidth", RtfCommandType.Value),

    trgaph("trgaph", RtfCommandType.Value),

    trhdr("trhdr", RtfCommandType.Flag),

    trkeep("trkeep", RtfCommandType.Flag),

    trkeepfollow("trkeepfollow", RtfCommandType.Flag),

    trleft("trleft", RtfCommandType.Value),

    trowd("trowd", RtfCommandType.Flag),

    trpaddb("trpaddb", RtfCommandType.Value),

    trpaddfb("trpaddfb", RtfCommandType.Value),

    trpaddfl("trpaddfl", RtfCommandType.Value),

    trpaddfr("trpaddfr", RtfCommandType.Value),

    trpaddft("trpaddft", RtfCommandType.Value),

    trpaddl("trpaddl", RtfCommandType.Value),

    trpaddr("trpaddr", RtfCommandType.Value),

    trpaddt("trpaddt", RtfCommandType.Value),

    trpadob("trpadob", RtfCommandType.Value),

    trpadofb("trpadofb", RtfCommandType.Value),

    trpadofl("trpadofl", RtfCommandType.Value),

    trpadofr("trpadofr", RtfCommandType.Value),

    trpadoft("trpadoft", RtfCommandType.Value),

    trpadol("trpadol", RtfCommandType.Value),

    trpador("trpador", RtfCommandType.Value),

    trpadot("trpadot", RtfCommandType.Value),

    trpat("trpat", RtfCommandType.Value),

    trqc("trqc", RtfCommandType.Flag),

    trql("trql", RtfCommandType.Flag),

    trqr("trqr", RtfCommandType.Flag),

    trrh("trrh", RtfCommandType.Value),

    trshdng("trshdng", RtfCommandType.Value),

    trspdb("trspdb", RtfCommandType.Value),

    trspdfb("trspdfb", RtfCommandType.Value),

    trspdfl("trspdfl", RtfCommandType.Value),

    trspdfr("trspdfr", RtfCommandType.Value),

    trspdft("trspdft", RtfCommandType.Value),

    trspdl("trspdl", RtfCommandType.Value),

    trspdr("trspdr", RtfCommandType.Value),

    trspdt("trspdt", RtfCommandType.Value),

    trspob("trspob", RtfCommandType.Value),

    trspofb("trspofb", RtfCommandType.Value),

    trspofl("trspofl", RtfCommandType.Value),

    trspofr("trspofr", RtfCommandType.Value),

    trspoft("trspoft", RtfCommandType.Value),

    trspol("trspol", RtfCommandType.Value),

    trspor("trspor", RtfCommandType.Value),

    trspot("trspot", RtfCommandType.Value),

    truncatefontheight("truncatefontheight", RtfCommandType.Flag),

    truncex("truncex", RtfCommandType.Flag),

    trwWidthA("trwWidthA", RtfCommandType.Value),

    trwWidthB("trwWidthB", RtfCommandType.Value),

    trwWidth("trwWidth", RtfCommandType.Value),

    ts("ts", RtfCommandType.Value),

    tsbgbdiag("tsbgbdiag", RtfCommandType.Flag),

    tsbgcross("tsbgcross", RtfCommandType.Flag),

    tsbgdcross("tsbgdcross", RtfCommandType.Flag),

    tsbgdkbdiag("tsbgdkbdiag", RtfCommandType.Flag),

    tsbgdkcross("tsbgdkcross", RtfCommandType.Flag),

    tsbgdkdcross("tsbgdkdcross", RtfCommandType.Flag),

    tsbgdkfdiag("tsbgdkfdiag", RtfCommandType.Flag),

    tsbgdkhor("tsbgdkhor", RtfCommandType.Flag),

    tsbgdkvert("tsbgdkvert", RtfCommandType.Flag),

    tsbgfdiag("tsbgfdiag", RtfCommandType.Flag),

    tsbghoriz("tsbghoriz", RtfCommandType.Flag),

    tsbgvert("tsbgvert", RtfCommandType.Flag),

    tsbrdrb("tsbrdrb", RtfCommandType.Flag),

    tsbrdrdgl("tsbrdrdgl", RtfCommandType.Flag),

    tsbrdrdgr("tsbrdrdgr", RtfCommandType.Flag),

    tsbrdrh("tsbrdrh", RtfCommandType.Flag),

    tsbrdrl("tsbrdrl", RtfCommandType.Flag),

    tsbrdrr("tsbrdrr", RtfCommandType.Flag),

    tsbrdrt("tsbrdrt", RtfCommandType.Flag),

    tsbrdrv("tsbrdrv", RtfCommandType.Flag),

    tscbandhorzeven("tscbandhorzeven", RtfCommandType.Flag),

    tscbandhorzodd("tscbandhorzodd", RtfCommandType.Flag),

    tscbandsh("tscbandsh", RtfCommandType.Value),

    tscbandsv("tscbandsv", RtfCommandType.Value),

    tscbandverteven("tscbandverteven", RtfCommandType.Flag),

    tscbandvertodd("tscbandvertodd", RtfCommandType.Flag),

    tscellcbpat("tscellcbpat", RtfCommandType.Value),

    tscellcfpat("tscellcfpat", RtfCommandType.Value),

    tscellpaddb("tscellpaddb", RtfCommandType.Value),

    tscellpaddfb("tscellpaddfb", RtfCommandType.Value),

    tscellpaddfl("tscellpaddfl", RtfCommandType.Value),

    tscellpaddfr("tscellpaddfr", RtfCommandType.Value),

    tscellpaddft("tscellpaddft", RtfCommandType.Value),

    tscellpaddl("tscellpaddl", RtfCommandType.Value),

    tscellpaddr("tscellpaddr", RtfCommandType.Value),

    tscellpaddt("tscellpaddt", RtfCommandType.Value),

    tscellpct("tscellpct", RtfCommandType.Value),

    tscellwidth("tscellwidth", RtfCommandType.Value),

    tscellwidthfts("tscellwidthfts", RtfCommandType.Value),

    tscfirstcol("tscfirstcol", RtfCommandType.Flag),

    tscfirstrow("tscfirstrow", RtfCommandType.Flag),

    tsclastcol("tsclastcol", RtfCommandType.Flag),

    tsclastrow("tsclastrow", RtfCommandType.Flag),

    tscnecell("tscnecell", RtfCommandType.Flag),

    tscnwcell("tscnwcell", RtfCommandType.Flag),

    tscsecell("tscsecell", RtfCommandType.Flag),

    tscswcell("tscswcell", RtfCommandType.Flag),

    tsd("tsd", RtfCommandType.Flag),

    tsnowrap("tsnowrap", RtfCommandType.Flag),

    tsrowd("tsrowd", RtfCommandType.Flag),

    tsvertalb("tsvertalb", RtfCommandType.Flag),

    tsvertalc("tsvertalc", RtfCommandType.Flag),

    tsvertalt("tsvertalt", RtfCommandType.Flag),

    twoinone("twoinone", RtfCommandType.Value),

    twoonone("twoonone", RtfCommandType.Flag),

    tx("tx", RtfCommandType.Value),

    txbxtwalways("txbxtwalways", RtfCommandType.Flag),

    txbxtwfirst("txbxtwfirst", RtfCommandType.Flag),

    txbxtwfirstlast("txbxtwfirstlast", RtfCommandType.Flag),

    txbxtwlast("txbxtwlast", RtfCommandType.Flag),

    txbxtwno("txbxtwno", RtfCommandType.Flag),

    txe("txe", RtfCommandType.Destination),

    u("u", RtfCommandType.Value),

    uc("uc", RtfCommandType.Value),

    ud("ud", RtfCommandType.Destination),

    ul("ul", RtfCommandType.Toggle),

    ulc("ulc", RtfCommandType.Value),

    uld("uld", RtfCommandType.Flag),

    uldash("uldash", RtfCommandType.Toggle),

    uldashd("uldashd", RtfCommandType.Toggle),

    uldashdd("uldashdd", RtfCommandType.Toggle),

    uldb("uldb", RtfCommandType.Toggle),

    ulhair("ulhair", RtfCommandType.Toggle),

    ulhwave("ulhwave", RtfCommandType.Toggle),

    ulldash("ulldash", RtfCommandType.Toggle),

    ulnone("ulnone", RtfCommandType.Flag),

    ulth("ulth", RtfCommandType.Toggle),

    ulthd("ulthd", RtfCommandType.Toggle),

    ulthdash("ulthdash", RtfCommandType.Toggle),

    ulthdashd("ulthdashd", RtfCommandType.Toggle),

    ulthdashdd("ulthdashdd", RtfCommandType.Toggle),

    ulthldash("ulthldash", RtfCommandType.Toggle),

    ululdbwave("ululdbwave", RtfCommandType.Toggle),

    ulw("ulw", RtfCommandType.Flag),

    ulwave("ulwave", RtfCommandType.Toggle),

    up("up", RtfCommandType.Value),

    upr("upr", RtfCommandType.Destination),

    urtf("urtf", RtfCommandType.Value),

    useltbaln("useltbaln", RtfCommandType.Flag),

    usenormstyforlist("usenormstyforlist", RtfCommandType.Flag),

    userprops("userprops", RtfCommandType.Destination),

    usexform("usexform", RtfCommandType.Flag),

    utinl("utinl", RtfCommandType.Flag),

    v("v", RtfCommandType.Toggle),

    validatexml("validatexml", RtfCommandType.Value),

    vern("vern", RtfCommandType.Value),

    version("version", RtfCommandType.Value),

    vertal("vertal", RtfCommandType.Flag),

    vertalb("vertalb", RtfCommandType.Flag),

    vertalc("vertalc", RtfCommandType.Flag),

    vertalj("vertalj", RtfCommandType.Flag),

    vertalt("vertalt", RtfCommandType.Flag),

    vertdoc("vertdoc", RtfCommandType.Flag),

    vertsect("vertsect", RtfCommandType.Flag),

    viewbksp("viewbksp", RtfCommandType.Value),

    viewkind("viewkind", RtfCommandType.Value),

    viewnobound("viewnobound", RtfCommandType.Flag),

    viewscale("viewscale", RtfCommandType.Value),

    viewzk("viewzk", RtfCommandType.Value),

    wbitmap("wbitmap", RtfCommandType.Value),

    wbmbitspixel("wbmbitspixel", RtfCommandType.Value),

    wbmplanes("wbmplanes", RtfCommandType.Value),

    wbmwidthbyte("wbmwidthbyte", RtfCommandType.Value),

    webhidden("webhidden", RtfCommandType.Flag),

    wgrffmtfilter("wgrffmtfilter", RtfCommandType.Destination),

    widctlpar("widctlpar", RtfCommandType.Flag),

    widowctrl("widowctrl", RtfCommandType.Flag),

    windowcaption("windowcaption", RtfCommandType.Destination),

    wmetafile("wmetafile", RtfCommandType.Value),

    wpeqn("wpeqn", RtfCommandType.Flag),

    wpjst("wpjst", RtfCommandType.Flag),

    wpsp("wpsp", RtfCommandType.Flag),

    wraparound("wraparound", RtfCommandType.Flag),

    wrapdefault("wrapdefault", RtfCommandType.Flag),

    wrapthrough("wrapthrough", RtfCommandType.Flag),

    wraptight("wraptight", RtfCommandType.Flag),

    wraptrsp("wraptrsp", RtfCommandType.Flag),

    writereservation("writereservation", RtfCommandType.Destination),

    writereservhash("writereservhash", RtfCommandType.Destination),

    wrppunct("wrppunct", RtfCommandType.Flag),

    xe("xe", RtfCommandType.Destination),

    xef("xef", RtfCommandType.Value),

    xform("xform", RtfCommandType.Destination),

    xmlattr("xmlattr", RtfCommandType.Flag),

    xmlattrname("xmlattrname", RtfCommandType.Destination),

    xmlattrns("xmlattrns", RtfCommandType.Value),

    xmlattrvalue("xmlattrvalue", RtfCommandType.Destination),

    xmlclose("xmlclose", RtfCommandType.Destination),

    xmlname("xmlname", RtfCommandType.Destination),

    xmlns("xmlns", RtfCommandType.Value),

    xmlnstbl("xmlnstbl", RtfCommandType.Destination),

    xmlopen("xmlopen", RtfCommandType.Destination),

    xmlsdttcell("xmlsdttcell", RtfCommandType.Flag),

    xmlsdttpara("xmlsdttpara", RtfCommandType.Flag),

    xmlsdttregular("xmlsdttregular", RtfCommandType.Flag),

    xmlsdttrow("xmlsdttrow", RtfCommandType.Flag),

    xmlsdttunknown("xmlsdttunknown", RtfCommandType.Flag),

    yr("yr", RtfCommandType.Value),

    yts("yts", RtfCommandType.Value),

    yxe("yxe", RtfCommandType.Flag),

    zwbo("zwbo", RtfCommandType.Symbol),

    zwj("zwj", RtfCommandType.Symbol),

    zwnbo("zwnbo", RtfCommandType.Symbol),

    zwnj("zwnj", RtfCommandType.Symbol),

    outdisponlyhtml("outdisponlyhtml", RtfCommandType.Toggle), // Not in the spec

    cocoartf("cocoartf", RtfCommandType.Value), // Not in the spec

    cocoasubrtf("cocoasubrtf", RtfCommandType.Value); // Not in the spec

    /**
     * Constructor.
     */
    private RtfCommand(String commandName, RtfCommandType commandType) {
        this.commandName = commandName;
        this.commandType = commandType;
    }

    /**
     * Retrieve the command name, as it appears in the RTF file.
     */
    public String getCommandName() {
        return commandName;
    }

    /**
     * Retrieve the command type.
     */
    public RtfCommandType getCommandType() {
        return commandType;
    }

    /**
     * Translate a name into a RtfCommand instance.
     */
    public static RtfCommand getInstance(String commandName) {
        return MAP.get(commandName);
    }

    private final String commandName;
    private final RtfCommandType commandType;

    private static final Map<String, RtfCommand> MAP = new HashMap<String, RtfCommand>();

    static {
        for (RtfCommand command : RtfCommand.values()) {
            MAP.put(command.getCommandName(), command);
        }
        MAP.put("\r", RtfCommand.par);
        MAP.put("\n", RtfCommand.par);
    }
}
