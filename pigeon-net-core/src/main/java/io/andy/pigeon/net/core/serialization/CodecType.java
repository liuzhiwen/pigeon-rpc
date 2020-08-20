package io.andy.pigeon.net.core.serialization;


import lombok.Getter;

/**
 * 序列化类型
 * @author andy
 */

@Getter
public enum CodecType {
    CODEC_TYPE_JSON((byte)0x01, "json", "JSON序列化"),
    CODEC_TYPE_KRYO((byte)0x02, "kryo", "KRYO序列化"),
    CODEC_TYPE_PROTO_STUFF((byte)0x03, "protoStuff", "ProtoStuff序列化");

    private byte type;

    private String name;

    private String desc;

    CodecType(byte type, String name, String desc) {
        this.type = type;
        this.name = name;
        this.desc = desc;
    }

}