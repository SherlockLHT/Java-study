import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * ����һ���Զ����ע��(Annotation)�� �ڶ���ע��(Annotation)��ʱʹ������һ��ע����Retention
 * ��ע������ʹ����һ��ע���࣬��ô��ʹ�õ�ע����ͳ�ΪԪע��
 */
@Retention(RetentionPolicy.RUNTIME)
//Retentionע�����MyAnnotationע�����������
@Target( { ElementType.METHOD, ElementType.TYPE })
//Targetע�����MyAnnotationע����Լ�����Щ�ɷ��ϣ�����������ϣ������������ϣ����߷������ϵȳɷ�
/*
 * @Retention(RetentionPolicy.SOURCE)
 * ���ע�����˼����MyAnnotationע��ֻ��javaԴ�ļ��д��ڣ������.class�ļ���ע��Ͳ�������
 * @Retention(RetentionPolicy.CLASS)
 * ���ע�����˼����MyAnnotationע����javaԴ�ļ�(.java�ļ�)�д��ڣ������.class�ļ���ע��Ҳ�����ڣ�
 * ��MyAnnotationע�����ʶ���౻����������ص��ڴ��к�MyAnnotationע��Ͳ�������
 */
/*
 * ��������ע����MyAnnotation��ʹ����һ��ע���࣬�����Retention��ΪԪע�⡣
 * Retentionע�������е�"RetentionPolicy.RUNTIME"��˼����MyAnnotation���ע�����������һֱ��������ʱ������
 */
public @interface MyAnnotation {
}