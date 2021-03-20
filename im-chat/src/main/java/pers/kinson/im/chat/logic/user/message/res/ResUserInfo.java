package pers.kinson.im.chat.logic.user.message.res;

import io.netty.buffer.ByteBuf;
import pers.kinson.im.chat.logic.CmdConst;
import pers.kinson.im.chat.net.message.AbstractPacket;

public class ResUserInfo extends AbstractPacket {

	private long userId;
	/** 账号昵称 */
	private String userName;
	/** 性别 */
	private byte sex;
	/** 个性签名　*/
	private String signature;

	@Override
	public int getPacketId() {
		return CmdConst.ResUserInfo;
	}

	@Override
	public void writeBody(ByteBuf buf) {
		buf.writeLong(userId);
		writeUTF8(buf, userName);
		buf.writeByte(sex);
		writeUTF8(buf, signature);
	}

	@Override
	public void readBody(ByteBuf buf) {
		this.userId = buf.readLong();
		this.userName = readUTF8(buf);
		this.sex = buf.readByte();
		this.signature = readUTF8(buf);
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public byte getSex() {
		return sex;
	}

	public void setSex(byte sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "ResUserInfoMessage [userId=" + userId + ", userName=" + userName + ", signature=" + signature + ", sex="
				+ sex + "]";
	}

}
