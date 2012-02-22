package pt.ipb.snmpfs.prefs;

import java.io.IOException;

public class SnmpPrefs {
	public enum Version {
		V1, V2C, V3
	}

	public enum AuthProto {
		NONE, MD5, SHA
	}

	public enum PrivProto {
		NONE, SHA, DES, AES
	}

	String userName;

	String authPassphrase = null;

	String privPassphrase = null;

	String host = "127.0.0.1";

	int port = 161;

	AuthProto authProtocol = AuthProto.NONE;

	PrivProto privProtocol = PrivProto.NONE;

	Version version = Version.V2C;

	String community;

	public SnmpPrefs() {
	}
	
	public SnmpPrefs(String userName, AuthProto authProto, String authPass, PrivProto privProto, String privPass) {
		setVersion(Version.V3);
		setUserName(userName);
		setAuthPassphrase(authPass);
		setPrivPassphrase(privPass);
		setAuthProtocol(authProto);
		setPrivProtocol(privProto);
	}
	
	public SnmpPrefs(String userName, String authPass, String privPass) throws IOException {
		this(userName, AuthProto.MD5, authPass, PrivProto.DES, privPass);
	}

	public SnmpPrefs(String userName, String authPass) throws IOException {
		this(userName, AuthProto.MD5, authPass, PrivProto.NONE, null);
	}

	public SnmpPrefs(String userName) throws IOException {
		this(userName, AuthProto.NONE, null, PrivProto.NONE, null);
	}

	public SnmpPrefs(Version version, String community) throws IOException {
		setVersion(version);
		setCommunity(community);
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAuthPassphrase() {
		return authPassphrase;
	}

	public void setAuthPassphrase(String authPassphrase) {
		this.authPassphrase = authPassphrase;
	}

	public String getPrivPassphrase() {
		return privPassphrase;
	}

	public void setPrivPassphrase(String privPassphrase) {
		this.privPassphrase = privPassphrase;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public AuthProto getAuthProtocol() {
		return authProtocol;
	}

	public void setAuthProtocol(AuthProto authProtocol) {
		this.authProtocol = authProtocol;
	}

	public PrivProto getPrivProtocol() {
		return privProtocol;
	}

	public void setPrivProtocol(PrivProto privProtocol) {
		this.privProtocol = privProtocol;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public String getCommunity() {
		return community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	

}